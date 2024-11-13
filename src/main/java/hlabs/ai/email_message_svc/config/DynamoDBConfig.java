package hlabs.ai.email_message_svc.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.util.StringUtils;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(basePackages = "hlabs.ai.email_message_svc.repository")
public class DynamoDBConfig {

    @Value("${amazon.dynamodb.region}")
    private String region;

    @Value("${amazon.dynamodb.endpoint}")
    private String endpoint;

    @Value("${amazon.dynamodb.accessKeyId}")
    private String accessKeyId;

    @Value("${amazon.dynamodb.secretAccessKey}")
    private String secretAccessKey;

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        AmazonDynamoDB amazonDynamoDB =  new AmazonDynamoDBClient(amazonAWSCredentials());
        if (!StringUtils.isNullOrEmpty(endpoint)) {
        amazonDynamoDB.setEndpoint(endpoint);
        }
        return amazonDynamoDB;
    }

    @Bean
    public AWSCredentials amazonAWSCredentials() {
        return new BasicAWSCredentials(accessKeyId, secretAccessKey);
    }

}
