package com.company;
import java.util.*;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Integer[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        LinkedList<Integer> linkedList = new LinkedList<Integer>(list);

        linkedList.printList();
        linkedList.reverseList();
        linkedList.printList();
    }
}
