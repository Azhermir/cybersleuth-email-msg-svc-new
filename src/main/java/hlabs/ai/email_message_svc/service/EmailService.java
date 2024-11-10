package hlabs.ai.email_message_svc.service;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> getAllEmails() {
        return (List<Email>) emailRepository.findAll();
    }

    public Email getEmail(String uid) {
        return emailRepository.findByUId(uid);
    }
}
