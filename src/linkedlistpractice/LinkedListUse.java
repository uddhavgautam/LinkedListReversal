package linkedlistpractice;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author uddhav
 */
public class LinkedListUse {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(intArr));

        buildLinkedList(arrList);
        
    }

    public static void buildLinkedList(ArrayList<Integer> arrList) {
        MyLinkedList myLinkedList = new MyLinkedList(arrList);

        System.out.println("Original LinkedList");
        myLinkedList.printList(myLinkedList.head);

        myLinkedList.head = myLinkedList.reverse(myLinkedList.getHeadNode());

        System.out.println("Reversed linkedLlist ");
        myLinkedList.printList(myLinkedList.head);
    }
}
