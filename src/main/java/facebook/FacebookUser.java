package facebook;
import lombok.AllArgsConstructor;
import java.util.Date;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String email;
    private String country;
    private Date lastActiveTime;

    public FacebookUser(){
    }
}
