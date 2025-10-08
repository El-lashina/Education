package Example3009252;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try (FileReader rd = new FileReader("./src/Example3009252/data2.txt")) {
//            char str;
//            int sym;
//            int number =0;
//            while ((sym =rd.read())!=-1) {
//                str = (char) sym;
//                if (Character.isDigit(str)){
//                    number++;
//                }
//            }
//            System.out.println(number);
//        }catch (IOException ex) {
//            System.out.println("Ошибка чтения" + ex.getMessage());
//        }

        try (BufferedReader rd = new BufferedReader( new FileReader("./src/Example3009252/data3.txt"))) {
            String str;
            double sym =0;
            int number =0;
            while ((str = rd.readLine()) != null) {
                String[] world = str.split(" +");
                for (String item: world) {
                    try {
                        sym += Double.parseDouble(item);
                        number++;
                    } catch (NumberFormatException e) {
                        //пропускаем
                    }
                }
            }
            sym/=number;
            System.out.printf("%.2f",sym);
        }catch (IOException ex) {
            System.out.println("Ошибка чтения" + ex.getMessage());
        }

    }
}
