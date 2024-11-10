package hlabs.ai.email_message_svc;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackages = "hlabs.ai.email_message_svc.repository")
//@RequiredArgsConstructor
public class EmailMessageSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailMessageSvcApplication.class, args);
	}

}
