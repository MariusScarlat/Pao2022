package CitireScriereDinFisier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CitireScriereFisier {

    /*
    FileInputStream este de citire dintr-un fisier
    FileOutputStream este de scriere intr-un fisier

    citire/scriere se face pe 8 biti
     */

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("input.txt");
            fileOutputStream = new FileOutputStream("output.txt");

            int c;

            while((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {


                try {
                    if(fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if(fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
}
