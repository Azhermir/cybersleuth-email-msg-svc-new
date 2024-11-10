package hlabs.ai.email_message_svc.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@DynamoDBTable(tableName = "EnronDataDB")
@Getter
@Setter
public class Email {

    @DynamoDBHashKey(attributeName = "uid")
    private String uid;

    @DynamoDBHashKey(attributeName = "cleaned_text")
    private String cleanedText;
}
