package twitter;
import sender.*;
import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser user;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.user = twitterUser;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }
}

