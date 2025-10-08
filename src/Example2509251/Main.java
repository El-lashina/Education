package Example2509251;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
//       try(DataOutputStream out = new DataOutputStream(new FileOutputStream("./src/Example2509251/data.txt"))) {
//           out.writeDouble(3.14);
//           out.writeInt(125);
//           out.writeChar(40);
//
//       }catch (IOException ex) {
//           System.out.println(ex.getMessage());
//       }

        double sum = 0;
        try(DataInputStream in = new DataInputStream(new FileInputStream("./src/Example2509251/numbers.info"))) {
           for (int i = 1; i<=35; i++) {
               sum+= in.readDouble();
            }
            System.out.println(sum);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
