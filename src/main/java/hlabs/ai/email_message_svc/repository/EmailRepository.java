package hlabs.ai.email_message_svc.repository;

import hlabs.ai.email_message_svc.entity.Email;
//import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
//import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@EnableScan
public interface EmailRepository {

    Email findByUid(String uid);
    List<Email> findAllByUidsIn(List<String> uids);
}
