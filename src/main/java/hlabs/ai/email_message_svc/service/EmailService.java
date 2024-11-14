package hlabs.ai.email_message_svc.service;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.repository.EmailRepository;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import java.util.List;

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
