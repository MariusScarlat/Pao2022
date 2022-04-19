package Example4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopulatePersonFromCsvExample {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        try( var in = new BufferedReader(new FileReader("exampleOfInput.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Person p = new Person(fields[0], fields[1], Integer.parseInt(fields[2]));
                list.add(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Person p : list) {
            System.out.println(p);
        }
    }
}
