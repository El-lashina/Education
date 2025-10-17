package Module2_Collections.Example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Order> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ="";
        try {
            while (!(str = br.readLine()).equals("end")) {
                String[] world = str.split(" | \n");
                Order order = new Order(world[0], Integer.parseInt(world[1]));
                list.add(order);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Integer.compare(o2.getCheck(), o1.getCheck());
            }
        });
        for (Order item: list) {
            System.out.println(item);
        }
    }
}
