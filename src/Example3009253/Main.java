package Example3009253;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Purchase purchase1  = new Purchase("milk", 50,5);
//        Purchase purchase2 = new Purchase("sugar", 100, 2);
//        System.out.println(purchase1.total());

        try (BufferedReader rd = new BufferedReader(new FileReader("./src/Example3009253/purchases2.txt"))) {
            int num = Integer.parseInt(rd.readLine());
            Purchase [] purchases = new Purchase[num];
            for (int i =0; i< purchases.length; i++) {
                String str = rd.readLine();
                String[] worlds = str.split(";");
                try {
                    purchases[i] = new Purchase(worlds[0], Integer.parseInt(worlds[1]), Double.parseDouble(worlds[2]));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Список  пуст");
                    purchases[i]=null;
                }
            }
            int imin = 0;
            for (int i =0; i< purchases.length; i++) {
                if (purchases[i]!=null) {
                    if (purchases[i].total() < purchases[imin].total()) {
                        imin = i;
                    }
                }

            }
            System.out.println(purchases[imin]);
        }
        catch (IOException ex) {
            System.out.println("Ошибка чтения" + ex.getMessage());
        }
    }

}
