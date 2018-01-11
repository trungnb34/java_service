import com.util.ConnectionConfiguration;
import controller.PersonController;

import java.sql.Connection;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class firstapp {
    public static void main(String args[]) {
        PersonController person = new PersonController();
        person.createPersonTable();
    }
}
