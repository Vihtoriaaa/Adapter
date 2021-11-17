package data;

public class DataBase extends БазаДаних{
    private БазаДаних database;

    public DataBase (БазаДаних database) {
        this.database = database;
    }

    public DataBase() {
    }

    public String getUserData(){
        return database.отриматиДаніКористувача();
    }

    public String getStaticData(){
        return database.отриматиСтатистичніДані();
    }

    public String setDataBase(DataBase database){
        this.database = database;
        return "Done.";
    }
}
