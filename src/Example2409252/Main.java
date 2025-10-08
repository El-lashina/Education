package Example2409252;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in = new FileInputStream("./src/Example2409252/data.txt");
            out = new FileOutputStream("./src/Example2409252/result.txt");
            int item;
            while ((item = in.read())!=-1) {
                out.write(item);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода- вывода: " + ex.getMessage());
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) {
                System.out.println("Ошибка закрытия файла" + ex.getMessage());
            }
        }

    }
}
