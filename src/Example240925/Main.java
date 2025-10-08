package Example240925;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int [] data = new int [100];
        int k =0;
        int item;
        try {
            while ((item = System.in.read())!='#') {
                data[k] = item;
                k++;
                if (k==10) {
                    break;
                }
            }
            for (int i =0; i<k; i++) {
            System.out.write(data[i]);
            }
            System.out.flush();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода"+ e.getMessage());
        }
    }
}
