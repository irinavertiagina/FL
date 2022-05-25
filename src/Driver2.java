import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;



public class Driver2 {



    public static void main(String[] args) {
        Person person = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        System.out.println(person ==  person2);
        final String a = "asdf";
        String b = a + "";

        System.out.println(person.equals(person2));
}}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }


}






