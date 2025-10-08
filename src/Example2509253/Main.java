package Example2509253;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
//        try (RandomAccessFile ram = new RandomAccessFile("./src/Example2509253/data.bin", "r")){
//            ram.seek(6*Integer.BYTES);
//            int x = ram.readInt();
//            System.out.println(x);
//    } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        try (RandomAccessFile ram = new RandomAccessFile("./src/Example2509253/my.bin", "r")){
            ram.seek(0);
            double first = ram.readDouble();
            ram.seek(9*Double.BYTES);
            double last = ram.readDouble();
            double sum = first+last;
            System.out.println( first +" "+ last+ " "+ sum);
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }

    }
}
