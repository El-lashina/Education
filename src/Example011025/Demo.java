package Example011025;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("./src/Example011025/list.ser"));
            ArrayList <Integer> list = (ArrayList<Integer>) ob.readObject();
            Collections.sort(list);
            System.out.println(list.get(list.size()-1));
        } catch (IOException ex) {
            System.out.println("Ошибка чтения"+ ex.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка чтения файла десериализации" + e.getMessage());
        }
    }
}
