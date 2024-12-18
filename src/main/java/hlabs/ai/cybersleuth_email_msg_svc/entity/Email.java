package hlabs.ai.cybersleuth_email_msg_svc.entity;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String uid;
    private String cleanedText;
}
