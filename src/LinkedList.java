//taken from https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
import org.w3c.dom.Node;

import java.util.*;

public class LinkedList
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        //constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }//end Node

    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);

        if(list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            Node last = list.head;
            while(last.next!= null)
            {
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }//end insert


    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

}//end class


