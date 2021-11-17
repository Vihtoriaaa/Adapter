package sender;
import facebook.FacebookUser;
import facebook.MyFacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.MyTwitterUser;
import twitter.TwitterUser;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;


class MessageSenderTest {
    MessageSender sender;
    User sender_1;
    User sender_2;
    @BeforeEach
    void setUp() {
        sender = new MessageSender();
        FacebookUser user1 = new FacebookUser("hahalol@gmail.com", "Spain", new Date());
        TwitterUser user2 = new TwitterUser("mammoth@gmail.com", "Sweden", new Date());
        sender_1 = new MyFacebookUser(user1);
        sender_2= new MyTwitterUser(user2);
    }

    @Test
    void send() {
        assertFalse(sender.send("Hi!", sender_1, "USA"));
        assertTrue(sender.send("Bye!", sender_2, "Sweden"));
    }
}
