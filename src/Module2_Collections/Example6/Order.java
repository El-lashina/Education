package Module2_Collections.Example6;

public class Order {
    private String surname;
    private int check;

    public String getSurname() {
        return surname;
    }

    public int getCheck() {
        return check;
    }

    public Order() {
    }

    public Order(String surname, int check) {
        this.surname = surname;
        this.check = check;
    }

    @Override
    public String toString() {
        return surname + ' ' + check;
    }
}
