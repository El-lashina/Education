package Module2_Collections.Example7;

import java.util.Objects;

public class People {
    String surname;
    String name;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
    public People(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof People people)) return false;
        return Objects.equals(getSurname(), people.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSurname());
    }
}
