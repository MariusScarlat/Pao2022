package Arrays;

public class Example1 {

    //Array = colectie de obiecte de acelasi tip; in loc sa avem n variabile de acelasi tip, avem un array(vector) unde le stocam pe toate

    public static void main(String[] args) {
        /*tipuri de date primitive:
                         byte, short, int, long;
                         double, float
                         char
                         boolean
          String-ul care nu este primitiva
         */

        //initializare array
        String[] cars = new String[2];
        cars[0] = "BMW";
        cars[1] = "AUDI";

        String[] cars1 = {"AUDI", "BMW"};

        for (int i=0; i<cars.length; i++) {
            System.out.println("cars[" + i + "]=" + cars[i]);
        }

        //for enhanced
        // for(tip nume_variabila : lista/array)
        // System.out.println(nume_variabila);

        for(String s : cars) {
            System.out.println(s);
        }



    }

}
