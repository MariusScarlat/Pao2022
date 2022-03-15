package Assosiation.Composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
        Composition = strong association (adica copilul nu poate exista fara parinte)
 */
public class Test {

    public static void main(String[] args) {
        Office o1 = new Office("A" , "address 1");
        Office o2 = new Office("B" , "address 2");
        Office o3 = new Office("C" , "address 3");
        Office o4 = new Office("D" , "address 4");

        //lista imutabila = nu mai poate fi modificata
//        List<Office> officeList = Arrays.asList(o1, o2, o3, o4);

        final List<Office> officeList2 = new ArrayList<>();
        officeList2.add(new Office("1", "Address B"));
        officeList2.add(new Office("2", "Address C"));
        officeList2.add(new Office("3", "Address D"));


        Company company = new Company("Google", Arrays.asList(o1, o2, o3, o4));
        Company company1 = new Company("Endava", officeList2);
        System.out.println(company.getOffices());

    }
}
