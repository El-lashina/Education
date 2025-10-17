package Module2_Collections.Example10;

import Module2_Collections.Example9.Product;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> names = new TreeSet<>();
        String str = scanner.nextLine();
        while (!str.equals("end")) {
            if (names.add(str)) {
                System.out.println("OK");
            } else {
                int i = 1;;
                while (!names.add(str+i)) {
                    i++;
                }
               System.out.println(str+ i);
            }
            str = scanner.nextLine();
        }
//        for (String item : names) {
//            System.out.println(item);
//        }
    }
}
