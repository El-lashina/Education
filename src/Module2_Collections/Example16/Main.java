package Module2_Collections.Example16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, Integer> numbers = new HashMap<>();
        boolean flag = true;
        int tmp;
        do {
           try {
               tmp = scanner.nextInt();
               if (numbers.containsKey(tmp)) {
                   int number = numbers.get(tmp)+1;
                   numbers.put( tmp,number);
               }
               else {
                   numbers.put(tmp, 1);
               }
           } catch (InputMismatchException ex) {
               flag = false;
           }
        } while (flag);

        ArrayList < Map.Entry <Integer, Integer>> list = new ArrayList<>(numbers.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int result =0;
                if (o1.getValue() > o2.getValue()) result =-1;
                if (o1.getValue() < o2.getValue()) result =1;
                if (o1.getValue() == o2.getValue()) {
                    if (o1.getKey() > o2.getKey()) result = 1;
                    if (o1.getKey() < o2.getKey()) result = -1;
                }
                return result;
            }
        });
        for (Map.Entry<Integer,Integer> item : list) {
            System.out.println(item.getKey());
            return;
        }
    }
}
