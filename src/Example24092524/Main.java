package Example24092524;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int item1;
        int item2;
        int k=0;
        try (FileInputStream in1 = new FileInputStream ("./src/Example24092524/data.dat");FileInputStream in2 = new FileInputStream ("./src/Example24092524/promo.dat")) {
        while ((item1 = in1.read())!= -1) {
            item2 =in2.read();
            if(item1 == item2) {
                k++;
            }
        }
//      do {
//          item1 = in1.read();
//          item2 = in2.read();
//          if (item1-item2 ==0) {
//              k++;
//          }
//      } while (item1!=-1);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода"+ ex.getMessage());
        }
        System.out.println(k);
    }
}