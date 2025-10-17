package Module2_Collections.Example11;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap <Person, Double> persons = new HashMap<>();
        String buffer = scan.nextLine();
        while (!buffer.equals("end")) {
            String[] world = buffer.split(" ");
            Person person = new Person(world[0], Double.parseDouble(world[1]));
            Double prise = Double.parseDouble(world[1]);
            if (persons.containsKey(person)) {
                prise += persons.get(person);
            }
            persons.put(person, prise);
            buffer = scan.nextLine();
        }

        ArrayList <Map.Entry <Person, Double>> list = new ArrayList<>(persons.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Person, Double>>() {
            @Override
            public int compare(Map.Entry<Person, Double> o1, Map.Entry<Person, Double> o2) {
                return o1.getKey().getSurname().compareTo(o2.getKey().getSurname());
            }
        });

//        Comparator <Map.Entry <Person, Double>> comparator = Map.Entry.comparingByValue();
//        TreeSet<Map.Entry<Person, Double>> sortedSet = new TreeSet<>(comparator.reversed());
//        sortedSet.addAll(pairs);

        for (Map.Entry <Person, Double> item : list) {
            System.out.println(item.getKey()+ " " + String.format("%.2f",item.getValue()));
        }
//        Scanner scan = new Scanner(System.in);
//        HashMap <String, Double> persons = new HashMap<>();
//        String buffer = scan.nextLine();
//        while (!buffer.equals("end")) {
//            String[] world = buffer.split(" ");
//            Double prise = Double.parseDouble(world[1]);
//            if (persons.containsKey(world[0])) {
//                prise += prise;
//            }
//            persons.put(world[0], prise);
//            buffer = scan.nextLine();
//        }
//
//        Set <Map.Entry <String, Double>> pairs = persons.entrySet();
//        for (Map.Entry <String, Double> item : pairs) {
//            System.out.println(item.getKey()+ " " + item.getValue());
//        }
    }
}
