package hlabs.ai.email_message_svc.entity;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

//@DynamoDBTable(tableName = "EnronData-DataBase")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

//    @DynamoDBHashKey(attributeName = "uid")
    private String uid;

//    @DynamoDBAttribute(attributeName = "cleaned_text")
    private String cleanedText;
}
