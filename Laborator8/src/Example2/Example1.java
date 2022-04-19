package Example2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {

    public static void main(String[] args) {

        /*
            Writer = object that tells how to write
            Reader = object that tells how to read
            FileWriter = implementare de Writer
         */

        try (Writer w = new FileWriter("Test1.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(w)) {

            bufferedWriter.write("Hello World!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
