package StringExample;

/*
      imutabilitate = in momentul in care am creat un obiect, nu mai poate fi modificat
                    = clasa sa fie finala
                    = atributele sa fie private si sa am doar getteri nu si setteri
                    = constructor cu toti parametrii

     Clasa String = un obiect care contine o secventa de caractere. String este imutabil, adica nu poate fi schimbat.
                    De fiecare daca cand fac o schimbare pe un string, in spate se creaza o noua instanta de string.

     Exista un String Pool unde se creaza obiecte de tip String.


     StringBufer + StringBuilder care sunt mutabile.
     Singura diferenta dintre StringBuffer si StringBuilder este ca StringBuilder nu este sincronizat (O sa vorbim la threaduri)
 */
public class StringExample {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        //Se va verifica string pool-ul mai intai daca contine sau nu deja obiectul. Daca il contine se creaza o noua referinta, daca nu, se creaza o noua instanta de string in string pool
        String s3 = new String("Hello");
        //se apeleaza constructorul deci se va crea o noua instanta de string

        System.out.println("s1 si s2 " + (s1 == s2) );
        System.out.println("s1 si s3 " + (s1 == s3) ); //sunt doua obiecte diferite deci == va returna false si de aceea se foloseste equals pentru obiecte

        System.out.println("s1 si s2 " + s1.equals(s2));
        System.out.println("s1 si s3 " + s1.equals(s3));

        s1.concat(" World");
        System.out.println(s1);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("123");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        stringBuffer.append("!");
        System.out.println(stringBuffer);



    }
}
