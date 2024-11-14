package hlabs.ai.email_message_svc.controller;

import hlabs.ai.email_message_svc.entity.Email;
import hlabs.ai.email_message_svc.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmailController {

    @Autowired
    private EmailService emailService;

    @QueryMapping
    public Email getEmailByUid(@Argument String uid) {
        return emailService.getEmailByUid(uid);
    }

    @QueryMapping
    public List<Email> getEmailsByUids(@Argument List<String> uids) {
        return emailService.getEmailsByUids(uids);
    }
}
