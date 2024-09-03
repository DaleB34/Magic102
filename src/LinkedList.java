//taken from https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
import org.w3c.dom.Node;

import java.util.*;

public class LinkedList
{
    Node head;

    static class Node
    {
        Character data;
        Node next;

        //constructor
        Node(Character d)
        {
            data = d;
            next = null;
        }
    }//end Node

    public static LinkedList insert(LinkedList list, Character data)
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

        System.out.print("Character List: \n");
        int count = 1;

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.println(count + ":" +currNode.data.toString() + "\n ");

            // Go to next node
            currNode = currNode.next;
            count++;
        }
    }

}//end class


