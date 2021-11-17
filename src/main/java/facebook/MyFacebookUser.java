package facebook;
import java.util.Date;
import sender.*;

public class MyFacebookUser extends FacebookUser implements User {
    private FacebookUser user;

    public MyFacebookUser(FacebookUser user){
        this.user = user;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
}
