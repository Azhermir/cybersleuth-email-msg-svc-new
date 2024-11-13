package hlabs.ai.email_message_svc;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmailMessageSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailMessageSvcApplication.class, args);
	}

}
