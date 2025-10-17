package Module2_Collections.Example1;

public class Abiturient {
    private String surname;
    private  String name;
    private  int [] mark;

    public Abiturient(String surname, String name, int []mark) {
        this.surname = surname;
        this.name = name;
        this.mark = mark;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double average(){
        return (mark[0]+mark[1]+mark[2])/3.;
    }

    @Override
    public String toString() {
        return surname + ";" + name + ";" + mark[0] +";"+ mark[1]+ ";" + mark[2] + ";" + String.format("%.1f",average());
    }
}
