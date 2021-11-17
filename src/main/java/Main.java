import data.*;
import builder.*;
import authorization.*;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        db.setDataBase(db);
        authorization.setAuthorization(authorization);
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
