package hlabs.ai.email_message_svc.repository;

import hlabs.ai.email_message_svc.entity.Email;
import java.util.List;

public interface EmailRepository {

    Email findByUid(String uid);
    List<Email> findAllByUidsIn(List<String> uids);
}
