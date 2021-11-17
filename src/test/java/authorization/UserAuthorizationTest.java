package authorization;
import data.DataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserAuthorizationTest {
    Авторизація prev_auth;
    Authorization authorization;
    DataBase database;

    @BeforeEach
    void setUp() {
        prev_auth = new Авторизація();
        authorization = new Authorization();
        database = new DataBase();
    }

    @Test
    void authorise() {
        assertEquals(authorization.authorize(database), prev_auth.авторизуватися(database));
    }
}
