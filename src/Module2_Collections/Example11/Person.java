package Module2_Collections.Example11;

import java.util.Objects;

public class Person {
    private String surname;
    private double price;


    public String getSurname() {
        return surname;
    }

    public double getPrice() {
        return price;
    }

    public Person(String surname, double price) {
        this.surname = surname;
        this.price = price;
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
        return surname;
    }
}
