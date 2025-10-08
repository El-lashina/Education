package Example011025;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./src/Example011025/massiv.ser"));
            Object obj = os.readObject();
            double [] mas = (double[]) obj;
            double summ = 0;
            for (int i = 0; i < mas.length; i++) {
                summ+=mas[i];
            }
            System.out.printf("%.2f",summ/ mas.length);
        } catch (IOException ex) {
            System.out.println("Ошибка чтения" + ex.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
