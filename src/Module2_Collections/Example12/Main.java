package Module2_Collections.Example12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int number =1;
        TreeMap <String, Integer> map = new TreeMap<>();
        try {
            while (!(str = br.readLine()).equals("end")) {
                str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
                String [] word = str.split(" +");
                for (int i =0; i< word.length; i++) {
                    if (map.containsKey(word[i])) {
                        number = map.get(word[i])+1;
                    }
                    map.put(word[i], number );
                    number =1;
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }

//        Comparator <Map.Entry<String, Integer>> comparator = Map.Entry.comparingByValue();
//        TreeSet <Map.Entry<String, Integer>> sortedSet = new TreeSet<>(comparator);
//        Set <Map.Entry<String, Integer>> pairs = map.entrySet();
//        sortedSet.addAll(pairs);
        ArrayList <Map.Entry <String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int result = 0;
                if (o2.getValue() - o1.getValue() >0) result =1;
                if (o2.getValue() - o1.getValue() <0) result =-1;
                if (result == 0) result=o1.getKey().compareTo(o2.getKey());
                return result;
            }
    });

        int n =1;
        for (Map.Entry<String, Integer> item: list) {
            System.out.println(item.getKey()+ " " + item.getValue() );
            n++;
            if (n>10) return;
        }
    }
}
