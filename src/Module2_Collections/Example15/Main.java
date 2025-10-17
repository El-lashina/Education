package Module2_Collections.Example15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        LinkedHashMap<String, Repost> map = new LinkedHashMap<>();
        String who;
        String whon;
        try {
            int number = Integer.parseInt(br.readLine());
            for (int i = 0; i < number; i++) {
                str = br.readLine();
                String[] word = str.split(" ");
                who = word[0];
                whon = word[2];
                if (map.containsKey(whon)) {
                    int totalRepost = map.get(whon).getNumberRepost()+1;
                    Repost repost = new Repost(whon, totalRepost);
                    map.put(who, repost);
                } else {
                    Repost repost = new Repost(whon, 1);
                    map.put(who, repost);
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }

        Set<Map.Entry<String, Repost>> pairs = map.entrySet();
        Iterator<Map.Entry<String, Repost>> iterator = pairs.iterator();
        int max =1;
        while (iterator.hasNext()) {
            Map.Entry<String, Repost> pair = iterator.next();
            if (pair.getValue().getNumberRepost()>max) {
                max = pair.getValue().getNumberRepost();
            }
        }
        System.out.println(max);
    }
}