package users;

import twitter.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterUserTest {
    TwitterUser twitterUser;
    MyTwitterUser myTwitterUser;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("vikapobeditelnitsa@twitterdev.com", "Spain", new Date());
        myTwitterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getCountry(){
        assertEquals(myTwitterUser.getCountry(), "Spain");
        assertEquals(myTwitterUser.getCountry(), twitterUser.getCountry());
    }

    @Test
    void getEmail(){
        assertEquals(myTwitterUser.getEmail(), "vikapobeditelnitsa@twitterdev.com");
        assertEquals(myTwitterUser.getEmail(), twitterUser.getEmail());
    }

    @Test
    void getLastActiveTime(){
        assertEquals(myTwitterUser.getLastActiveTime(), twitterUser.getLastActiveTime());
    }
}
