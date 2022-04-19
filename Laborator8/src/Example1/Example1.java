package Example1;

public class Example1 {
    /*
    Streamurile sunt un subiect low level care nu se foloseste foarte mult. Sunt folosite pentru a realiza comunicarea dintre 2 aplicatii (Una scrie intr-un fisier si cealalta citeste) etc.
    Streamul in sine este un canal de comunicare (Datele sunt transformate in bytes si sunt trimise)
    Toate sistemele de messaging au la baza streamurile

    Fiecare stream are o directie (input/output)
    Input: citire
    Output: scriere

    Low-Level Streams: (pe bytes)
        InputStream
        OutputStream
        FileInputStream (pentru fisiere)
        FileOutputStream (pentru fisiere)

    High-Level Streams:
        PrintStream
        PrintWriter
        BufferedReader
        BufferedWriter
        ObjectInputStream
        ObjectOutputStream

     Exceptiile care se arunca in cadrul streamurilor sunt: IOException si FileNotFoundException

     */
    public static void main(String[] args) {
        System.out.println(":)");
    }
}
