package authorization;
import data.*;


public class Авторизація {
    public boolean авторизуватися(БазаДаних database) {
        database.отриматиДаніКористувача();
        return true;
    }
}
