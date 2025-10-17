package Module2_Collections.Example13;

import java.util.Objects;

public class Person {
    private  String surname;
    private  String name;
    private int number;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Person(String surname, String name, int number) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSurname());
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }
}
