package Example2509252;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(DataInputStream in = new DataInputStream(new FileInputStream("./src/Example2509252/array.dat"))) {
            int kol = in.readInt();
            System.out.println(kol);
            double sum =0.;
            for (int i = 1; i <= kol; i++) {
            sum+= in.readInt();
            }
            sum=sum/kol;
            System.out.println(sum);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
