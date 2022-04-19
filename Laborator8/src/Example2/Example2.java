package Example2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example2 {
    public static void main(String[] args) {

        Writer w = null;
        BufferedWriter bufferedWriter = null;
        // in cazul in care nu folosesc try with resources pentru scriere, trebuie sa folosesc metoda flush() sau sa inchid resursa in blocul finally
        try {

            w = new FileWriter("Test2.txt");
            bufferedWriter = new BufferedWriter(w);

            bufferedWriter.write("Hello World From Example 2!!!!");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
