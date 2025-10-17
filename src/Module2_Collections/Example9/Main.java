package Module2_Collections.Example9;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet <Product> products = new TreeSet<>();
//        TreeSet <Product> products = new TreeSet<>(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getSale() > o2.getSale())
//                    return 1;
//                if (o1.getSale() < o2.getSale())
//                    return -1;
//                return 0;
//            }
//        });
        String str = scan.nextLine();
        while (!str.equals("end")) {
            String [] words = str.split("#");
            products.add(new Product(words[0], words[1], Integer.parseInt(words[2])));
            str = scan.nextLine();
        }
        for (Product item: products) {
            System.out.println(item);
        }
    }
}
