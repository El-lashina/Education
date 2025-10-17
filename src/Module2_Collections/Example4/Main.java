package Module2_Collections.Example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        Scanner scan = new Scanner(System.in);
        String buf = scan.nextLine();
        String[] parts = buf.split(" ");
        for (String item : parts) {
            queue.add(Integer.parseInt(item));
        }
        System.out.println("Исходная очередь:");
        queue.print();
        buf = scan.nextLine();
        switch (Integer.parseInt(buf)) {
            case 1:
                MyQueue<Integer> list2 = queue.reverse();
                System.out.println("Результат:");
                list2.print();
                break;
            case 2:
                int start = scan.nextInt();
                int finish = scan.nextInt();
                MyQueue<Integer> list3 = queue.reverse(start, finish);
                System.out.println("Результат:");
                if (list3 != null) {
                    list3.print();
                } else {
                    System.out.println("Ошибочные данные!");
                }
                break;
            case 3:
                int result = queue.middleNode();
                System.out.println("Средний элемент: " + result);
                break;
        }
    }
}
