import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields in JSON
public class Notification {

    /**
     * The message to be sent to the user
     */
    private String message;

    /**
     * The user id to whom the notification is to be sent
     */
    private UUID destinationUserId;

    /**
     * The user id whose action triggered the notification
     */
    private UUID sourceUserId;

    /**
     * The job post id for which the notification is to be sent
     */
    private Long jobPostId;


    /**
     * The action url to be sent to the user. E.g /jobpost/{jobPostId}
     */
    private String actionUrl;


    /**
     * The action to be performed by the user. E.g APPLY, VIEW
     */
    @JsonProperty("actionType")
    private ActionType actionType;

}
