package twitter;
import lombok.AllArgsConstructor;
import java.util.Date;
import lombok.Getter;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String email;
    private String country;
    private Date lastActiveTime;

    public TwitterUser(){
    }
}
