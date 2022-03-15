package ColectionsInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
        Set(interfata care mosteneste Collection): colectie de date neordonata care nu ne lasa sa stocam duplicate. Se poate stoca o valoare de null
                      Implementari: HashSet care foloseste un tabel de hashuri pentru stocare
                                    LinkedHashSet care extinde HashSet si mentinea ordinea de inserare

 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> setExample = new HashSet<>();

        setExample.add("a");
        setExample.add("b");
        setExample.add("c");
        setExample.add("a");

        System.out.println(setExample);

        Iterator it = setExample.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        setExample.remove("a");

        System.out.println(setExample);

    }
}
