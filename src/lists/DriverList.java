package lists;

import java.util.LinkedList;
import java.util.List;

public class DriverList {
    public static void main(String[] args) {
        myLinkedList oneLinkedList = new myLinkedList();
        List<Integer> twoLinkedList = new LinkedList<>();

        oneLinkedList.add(7);
        oneLinkedList.add(2);
        oneLinkedList.add(31);


        System.out.println(oneLinkedList);
       // oneLinkedList.remove(0);
        System.out.println(oneLinkedList);
    }
}
