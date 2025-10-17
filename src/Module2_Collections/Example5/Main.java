package Module2_Collections.Example5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        Scanner scan = new Scanner(System.in);
        String buf = scan.nextLine();
        String[] parts = buf.split(" +");
        for (String item : parts) {
            try {
                queue.add(Integer.parseInt(item));
            }catch(NumberFormatException ex){
                //пропускаем неверный элемент
            }
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
                int size = queue.size();
                System.out.println("Количество элементов: " + size);
                break;
            case 3:
                Integer result = queue.middleNode();
                System.out.println("Средний элемент: " + result);
                break;
        }
    }
}
