package Module2_Collections.Example14;

import Module2_Collections.Example13.Person;

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
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        String newName;
        String oldName;
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.println();
            for (int i = 0; i < number; i++) {
                str = br.readLine();
                String[] word = str.split(" ");
                oldName = word[0];
                newName = word[1];
                if (map.containsValue(oldName)) {
                    Set <Map.Entry<String, String>> pairs = map.entrySet();
                    for (Map.Entry<String, String> item : pairs) {
                        if (oldName.equals(item.getValue())) {
                            oldName = item.getKey();
                        }
                    }
                }
                map.put(oldName, newName);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }

        Set<Map.Entry<String, String>> pairs = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
