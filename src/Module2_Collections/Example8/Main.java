package Module2_Collections.Example8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> wordTreeSets = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        String buffer = scan.nextLine();
        while (!buffer.equals("end")) {
            buffer = buffer.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            String[] word = buffer.split(" +");
            for (int i = 0; i < word.length; i++) {
                wordTreeSets.add(word[i]);
            }
            buffer = scan.nextLine();
        }
        for (String item:wordTreeSets) {
            System.out.println(item);
        }
    }
}
