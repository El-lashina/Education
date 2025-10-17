package Module2_Collections.Example13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        HashMap <Person, Integer> map = new HashMap<>();
        int number = 1;
        try {
            while (!(str = br.readLine()).equals("end")) {
                String[] word = str.split(" ");
                Person person = new Person(word[0],word[1], number);
                if (map.containsKey(person)) {
                    number = map.get(person)+1;
                }
                map.put(person, number);
                number =1;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
        Set <Map.Entry <Person, Integer>> pairs = map.entrySet();
        Iterator <Map.Entry<Person, Integer>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue()> 1) {
                iterator.remove();
            }
        }

        System.out.println();

        ArrayList < Map.Entry<Person, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Person, Integer>>() {
            @Override
            public int compare(Map.Entry<Person, Integer> o1, Map.Entry<Person, Integer> o2) {
                return o1.getKey().getSurname().compareTo(o2.getKey().getSurname());
            }
        });
        for (Map.Entry<Person, Integer> item: list) {
            System.out.println(item.getKey());
        }
    }
}
