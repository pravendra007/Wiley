package LinkedList_and_Map;

import java.util.*;
public class LinkedList_and_map2 {
	public static void main(String args[]) {
		node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(11);
        start.next.next.next.next.next.next = new node(10);
 
        System.out.println(
            "Linked list before removing duplicates :");
        printList(start);
 
        removeDuplicate(start);
 
        System.out.println(
            "\nLinked list after removing duplicates :");
        printList(start);
	}
	
	static void removeDuplicate(node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();
 
        /* Pick elements one by one */
        node current = head;
        node prev = null;
        while (current != null) {
            int curval = current.val;
 
            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
	static void printList(node head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

class node {
    int val;
    node next;

    public node(int val) {
    	this.val = val;
    }
}
