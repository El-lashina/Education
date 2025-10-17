package Module2_Collections.Example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PeopleCollection {
    private HashSet <People> peoples;

    public PeopleCollection() {
        peoples= new HashSet<>();
    }

    void readPeople () {
        String str;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        try {
            while (!(str = br.readLine()).equals("end")) {
                String[] worlds = str.split(" |\n");
                People people = new People(worlds[0], worlds[1]);
                peoples.add(people);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
    }

    public int getNumber () {
        return peoples.size();
    }


}
