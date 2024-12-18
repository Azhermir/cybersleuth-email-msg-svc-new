package hlabs.ai.cybersleuth_email_msg_svc.repository;

import hlabs.ai.cybersleuth_email_msg_svc.entity.Email;
import java.util.List;

public interface EmailRepository {

    Email findByUid(String uid);
    List<Email> findAllByUidsIn(List<String> uids);
}
