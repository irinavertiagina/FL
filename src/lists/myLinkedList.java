package lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class myLinkedList {
    private Node head;
    int size;

    void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
        size++;
    }



        public String toString () {
        int[]arr = new int[size];
        Node temp = head;
        for(int i = 0; i<size; i++){
            arr[i] = temp.data;
            while (temp.next != null)
            temp=temp.next;
        }
        return Arrays.toString(arr);
        }


    }


class Node{
    Node next;
    int data;

    Node(){}
    Node(int data){
        this.data = data;
    }

}