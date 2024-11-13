package hlabs.ai.email_message_svc.service;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    private EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public List<Email> getAllEmails() {
        return (List<Email>) emailRepository.findAll();
    }

    public Email getEmailByUid(String uid) {
        return emailRepository.findByUid(uid);
    }

    public List<Email> getEmailsByUids(List<String> uids) {
        return (List<Email>) emailRepository.findAllByUidIn(uids);
    }
}
