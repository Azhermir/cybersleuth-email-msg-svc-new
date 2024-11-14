package hlabs.ai.email_message_svc.service;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmailService {

    private EmailRepository emailRepository;
    private DynamoDbClient dynamoDbClient;

    public EmailService(EmailRepository emailRepository, DynamoDbClient dynamoDbClient) {
        this.emailRepository = emailRepository;
        this.dynamoDbClient = dynamoDbClient;
    }

    public Email getEmailByUid(String uid) {
        return emailRepository.findByUid(uid);
    }

    public List<Email> getEmailsByUids(List<String> uids) {
        return emailRepository.findAllByUidsIn(uids);
    }
}
