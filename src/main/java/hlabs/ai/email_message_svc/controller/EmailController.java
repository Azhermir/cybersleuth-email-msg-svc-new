package hlabs.ai.email_message_svc.controller;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class EmailController {

    @Autowired
    private EmailService emailService;

    @QueryMapping
    public List<Email> getEmails() {
        return emailService.getAllEmails();
    }

    @QueryMapping
    public Email getEmail(String uid) {
        return emailService.getEmail(uid);
    }
}
