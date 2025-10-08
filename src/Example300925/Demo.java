package Example300925;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader( new FileReader("./src/Example300925/data1.txt"));
             FileWriter br2= new FileWriter("./src/Example300925/data2.txt")) {
            String str;
            while ((str =br.readLine())!=null) {
                String [] world = str.split(" ");
                for (int i =0; i<world.length; i++) {
                    if (world[i].toLowerCase().contains("поток")){
                        br2.write("XXX ");
                    } else if (i< world.length-1) {
                        br2.write(world[i]+ " ");
                    } else br2.write(world[i]);
                }
                br2.write("\r\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла"+ ex.getMessage());
        }
    }
}
