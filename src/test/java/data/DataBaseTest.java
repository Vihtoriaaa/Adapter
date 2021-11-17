package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    DataBase dataBase;
    БазаДаних db;

    @BeforeEach
    void setUp() {
        db = new БазаДаних();
        dataBase = new DataBase(db);
    }

    @Test
    void getUserData() {
        assertEquals(db.отриматиДаніКористувача(), dataBase.getUserData());
    }

    @Test
    void getStatisticData() {
        assertEquals(db.отриматиСтатистичніДані(), dataBase.getStaticData());
    }
}
