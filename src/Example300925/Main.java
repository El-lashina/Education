package Example300925;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        try (FileWriter wr = new FileWriter("./src/Example300925/text.txt")){
            String str =br.readLine();
            while (!(str.equals("stop"))) {
                str+="\r\n";
                wr.write(str);
                str=br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedReader br2 = new BufferedReader( new FileReader("./src/Example300925/text.txt"))) {
            String str;
            while ((str = br2.readLine())!= null) {
                System.out.println(str);
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
