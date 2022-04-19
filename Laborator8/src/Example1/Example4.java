package Example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
    public static void main(String[] args) {

        //var = cuvant cheie in java care este folosit pentru a nu mai specifica tipul variabilei. Totusi, initializarea trebuie sa se faca imediat dupa =
        // var a aparut din java 11

        try(var in = new BufferedReader(new InputStreamReader(System.in))) {
            String line = in.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
