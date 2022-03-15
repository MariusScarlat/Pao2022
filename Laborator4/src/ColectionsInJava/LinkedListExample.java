package ColectionsInJava;

import java.util.LinkedList;

/*
        Pe langa ArrayList, LinkedList mai are 4 metode: removeFirst, removeLast, addFirst, addLast
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        linkedList.addFirst("1");
        linkedList.addLast("2");

    }
}
