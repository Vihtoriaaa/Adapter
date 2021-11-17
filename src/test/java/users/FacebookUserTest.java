package users;
import facebook.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookUserTest {
    FacebookUser facebookUser;
    MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("vikapobeditelnitsa@gmail.com", "Ukraine", new Date());
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getCountry(){
        assertEquals(myFacebookUser.getCountry(), "Ukraine");
        assertEquals(myFacebookUser.getCountry(), facebookUser.getCountry());
    }

    @Test
    void getEmail(){
        assertEquals(myFacebookUser.getEmail(), "vikapobeditelnitsa@gmail.com");
        assertEquals(myFacebookUser.getEmail(), facebookUser.getEmail());
    }

    @Test
    void getLastActiveTime(){
        assertEquals(myFacebookUser.getLastActiveTime(), facebookUser.getLastActiveTime());
    }
}
