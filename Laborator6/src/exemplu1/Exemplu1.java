package exemplu1;

/*
        Expresia lambda a aparut tot cu java 8 pentru a nu mai fi nevoie sa implementez o interfata si sa ii suprascriu metodele
        Nu pot avea expresie lambda fara a avea o interfata functionala

        Expresiile lambda = este o functie fara nume (anonima)
                          = este o suprascriere la nivel local

       Sintaxa:
          parametru -> expresie
          (parametru1, parametru2) -> expresie
          () -> expresie
          (parametru1, parametru2, parametru3...) -> {
                bloc de cod
           }
 */

public class Exemplu1 {

    public static void main(String[] args) {

//        FirstFunctionalInterface firstFunctionalInterface = () -> {return "Say Hello";};
        FirstFunctionalInterface firstFunctionalInterface = () -> "Say Hello";

        System.out.println(firstFunctionalInterface.sayHello());




    }
}
