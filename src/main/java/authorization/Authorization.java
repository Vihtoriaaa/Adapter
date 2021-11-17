package authorization;
import data.*;

public class Authorization extends Авторизація{
    private Авторизація authorization;

    public Authorization () {
        this.authorization = new Авторизація();
    }

    public String setAuthorization(Авторизація authorization) {
        this.authorization = authorization;
        return "Setting authorization completed.";
    }

    public boolean authorize(DataBase database) {
        return authorization.авторизуватися(database);
    }
}
