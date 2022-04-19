package Example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

    public static void main(String[] args) {
        //System.in este un stream de tip low level
        //Scanner scanner = new Scanner(System.in);

        //InputStreamReader -> care este o implementare pentru Reader
        //FileReader -> la fel, implementare pentru Reader

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        //avem nevoie de un reader pentru BufferedReader pentru a sti cum sa transforme datele in bytes si invers
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
