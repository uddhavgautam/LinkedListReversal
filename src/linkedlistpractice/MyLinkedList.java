package linkedlistpractice;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author uddhav
 */
public class MyLinkedList extends LinkedList {
  public Node head, current;
  public ArrayList<Integer> arrayList;

   public Node getHeadNode() {
        return this.head;
    }  
   
    public class Node {   
        int data;
        Node next; 
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(ArrayList c) {
        if(c == null) {
            head = null;
            return;
        }
        this.arrayList = c;
        for (int i=0; i<c.size(); i++)   {
            if(i==0) {
                head = new Node((Integer) c.get(i));
                current = head;
            }
            else {
                current.next = new Node((Integer) c.get(i));
                current = current.next;
            }
        }
    }    
     
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        int i=0;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        node = prev;
        return node;                
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }
}