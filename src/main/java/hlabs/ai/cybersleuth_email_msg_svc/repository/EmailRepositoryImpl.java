package hlabs.ai.cybersleuth_email_msg_svc.repository;

import hlabs.ai.cybersleuth_email_msg_svc.entity.Email;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class EmailRepositoryImpl implements EmailRepository {

    private final DynamoDbClient dynamoDbClient;
    private final String tableName = "Enron-DB";

    public EmailRepositoryImpl(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }

    @Override
    public Email findByUid(String uid) {
        Map<String, AttributeValue> key = new HashMap<>();
        key.put("uid", AttributeValue.builder().s(uid).build());
        GetItemRequest request = GetItemRequest.builder()
                .tableName(tableName) .key(key)
                .build();
        Map<String, AttributeValue> item = dynamoDbClient.getItem(request).item();
        if (item == null || item.isEmpty()) { return null; }
        Email email = new Email();
        email.setUid(item.get("uid").s());
        email.setCleanedText(item.get("cleaned_text").s());
        return email;
    }
    @Override
    public List<Email> findAllByUidsIn(List<String> uids) {
        List<Map<String, AttributeValue>> keys = uids.stream()
                .map(uid -> Map.of("uid", AttributeValue.builder().s(uid).build()))
                .collect(Collectors.toList());
        Map<String, KeysAndAttributes> requestItems = Map.of(
                tableName, KeysAndAttributes
                .builder().keys(keys).build()
        );
        BatchGetItemRequest batchRequest = BatchGetItemRequest.builder()
                .requestItems(requestItems)
                .build();
        BatchGetItemResponse response = dynamoDbClient.batchGetItem(batchRequest);
        List<Map<String, AttributeValue>> items = response.responses().get(tableName);
        return items.stream().map(item -> {
            Email email = new Email();
            email.setUid(item.get("uid").s());
            email.setCleanedText(item.get("cleaned_text").s());
            return email;
        }).collect(Collectors.toList());
    }
}