package Interface;

import entities.Person;

import java.util.List;

public interface IPerson {

    void createPersonTable();

    void insertPerson(Person person);

    Person selectById(int id);

    List<Person> selectAll();

    void delete(int id);

    void update(Person person, int id);
}
