package controller;

import Interface.IPerson;
import com.util.ConnectionConfiguration;
import entities.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonController implements IPerson {
    @Override
    public void createPersonTable() {
        Connection connection = null;

        Statement statement = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS person(id int primary key unique auto_increment," +
                    " first_name varchar(55), last_name varchar(55))";
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void insertPerson(Person person) {

    }

    @Override
    public Person selectById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Person person, int id) {

    }
}
