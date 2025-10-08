package Example24092523;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int item;
        int k=0;
        try (FileInputStream in = new FileInputStream ("./src/Example24092523/info.dat")) {
            do {
                item = in.read();
                if (item >=50 && item<=100) {
                    k++;
                }
            } while (item!=-1);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода"+ ex.getMessage());
        }
        System.out.println(k);
    }
}
