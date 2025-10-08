package Example3009254;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./src/Example3009254/enigma.ser"));
            Object object = os.readObject();
            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка чтения файла");;
        }
    }
}
