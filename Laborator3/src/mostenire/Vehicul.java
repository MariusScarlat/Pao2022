package mostenire;

/*
        Mostenirea: -o folosim pentru a extrage codul duplicat
                    -pentru a extrage atributele si metodele comune intr-o superclasa

        Caracteristicile mostenirii: -in java se poate mosteni o singura clasa
                                     -orice clasa, by default, mosteneste clasa Object (toString(), hashCode(), equals())
        Avem 2 parti: sublacasa care mosteneste
                      superclasa care este mostenita

        O clasa care are cuvantul final, nu mai poate fi mostenita.

        Polimorfism(= many form): -este obtinut prin mostenire
                                  -este de 2 feluri: supraincarcare(overloading)
                                                     suprascriere (overriding)

       Supraincarcare(=overloading): mai multe metode cu acelasi nume dar tipul parametrilor sau numarul parametrilor este diferit

       Suprascriere(=overriding): atunci cand clasa B mosteneste clasa A si rescrie o metoda din clasa A.
                    Ordinea modificatorilor de acces de la cel mai restrictiv la cel mai putin restrictiv: private < default < protected < public
                                 Regulile suprascrierii (overriding): 1. Metoda care suprascrie trebuie sa aiba un modificator de acces cel putin la fel de public.
                                                                      2. Daca metoda suprascrisa are ca tip returnat un obiect, atunci metoda care suprascrie trebuie sa respecte regulile polimorfismului
                                                                      3. Metoda care suprascrie nu poate arunca un spectru de exceptii mai larg decat metoda suprascrisa.

       Cuvantul cheie super: -poate fi folosit pentru a ne referi la instanta clasei superioare
                             -poate fi folosit pentru a ne referi la metodele clasei superioare
                             -super() poate fi folosit pentru a apela constructorul clasei superioare
 */


public class Vehicul {

    String culoare;
    int numarRoti;

    public void claxon() {
        System.out.println("titit");
    }

    public void m() {
        System.out.println("In interiorul clasei Vehicul");
    }

}
