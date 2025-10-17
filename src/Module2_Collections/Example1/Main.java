package Module2_Collections.Example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Abiturient> abiturients = new ArrayList<> ();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String str ="";
        try {
            while (!(str = br.readLine()).equals("end")) {
                String [] word = str.split("#");
                try {
                    Abiturient abiturient = new Abiturient(word[0], word[1], new int[]{Integer.parseInt(word[2]), Integer.parseInt(word[3]), Integer.parseInt(word[4])});
                    abiturients.add(abiturient);
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    //ничего
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
        if (abiturients.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Collections.sort(abiturients, new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                if (!(o1.getSurname().equals(o2.getSurname()))) {
                    return o1.getSurname().compareTo(o2.getSurname());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Abiturient item: abiturients) {
            System.out.println(item);
        }
        System.out.println();
        Collections.sort(abiturients, new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return Double.compare (o2.average(), o1.average());
            }
        });
        for (Abiturient item: abiturients) {
            System.out.println(item);
        }
    }
}
