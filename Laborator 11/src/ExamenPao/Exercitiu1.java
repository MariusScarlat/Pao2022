package ExamenPao;


/*
        Interfata functionala = interfata care are o singura metoda abstracta

        Supplier = nu primeste nicio valoare si returneaza o valoare
        Consumer = primeste o valoare si nu returneaza nimic
        Predicate = primeste o valoare si returneaza true/false
        Function = primeste tipul de intrare si tipul de iesire
 */


import com.sun.deploy.util.StringUtils;

// se da un string de tipul (((((((()((()()()())))))))
// sa se returneze lungimea stringului dupa ce s-au scos toate perechile de tipul "()"
// ()
public class Exercitiu1 {

    public static void main(String[] args) {

        String s = "((((((((()()()())";

        int length = s.length();
        int p = s.indexOf("()");

//        while( p != -1 ) {
//                //[0, p) + [p+2 pana la final]
//            s = s.substring(0, p) + s.substring(p + 2);
//                    //(((((((( +
//            length = length - 2;
//            p = s.indexOf("()");
//        }
//
//        System.out.println(length);

        while(s.contains("()")) {

            s = s.replace("()", "");

        }

        length = s.length();
        System.out.println(length);



    }
}
