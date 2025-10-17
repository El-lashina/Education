package Module2_Collections.Example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        List <Integer> numbers = new ArrayList<>();
        String str = "";
        try {
            while (!(str = br.readLine()).equals("end")) {
                try {
                    numbers.add(Integer.parseInt(str));
                }catch (NumberFormatException ex) {
                    //ничего
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        numbers.set(numbers.size()/2, numbers.get(0)+numbers.get(numbers.size()-1));
        System.out.println(numbers);
    }
}
