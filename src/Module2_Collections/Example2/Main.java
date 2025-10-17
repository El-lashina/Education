package Module2_Collections.Example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Commodity> commodityBelarus = new ArrayList<>();
        List <Commodity> commodityOther = new ArrayList<>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String str = "";
        try {
            while (!(str = br.readLine()).equals("end")) {
                String[] world = str.split("/");
                try {
                    Commodity commodity = new Commodity(world[0], Integer.parseInt(world[1]), world[2]);
                    if (world[2].equals("Беларусь")) {
                        commodityBelarus.add(commodity);
                    } else {
                        commodityOther.add(commodity);
                    }
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    //ничего
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
        if (!(commodityBelarus.isEmpty())) {
            Collections.sort(commodityBelarus, new Comparator<Commodity>() {
                @Override
                public int compare(Commodity o1, Commodity o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (Commodity item : commodityBelarus) {
                System.out.println(item);
            }
        } else {
            System.out.println("Список товаров из Беларуси пуст");
        }

        System.out.println();

        if (!(commodityOther.isEmpty())) {
            Collections.sort(commodityOther, new Comparator<Commodity>() {
                @Override
                public int compare(Commodity o1, Commodity o2) {
                    return Integer.compare(o2.getPrice(), o1.getPrice());
                }
            });
        } else {
            System.out.println("Список товаров из других стран пуст");
        }
        for (Commodity item: commodityOther) {
            System.out.println(item);
        }
    }
}
