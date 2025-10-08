package Example290925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        String txt;
        StringBuilder result = new StringBuilder("");
        String [] symb;
        boolean flag = true;
        try {
            do {
                txt = br.readLine();
                symb = txt.split("");
                for (int i = 0; i < symb.length; i++) {
                    try {
                        Integer.parseInt(symb[i]);
                    } catch (NumberFormatException e) {
                        if (symb[i].equals("#")) {
                            flag = false;
                            break;
                        }
                        System.out.print(symb[i]);
                    }
                }
                System.out.println();
            } while (flag);
        } catch (IOException ex) {
            System.out.println("Ошибка чтения" + ex.getMessage());
        }
        System.out.println(result);
    }
}
