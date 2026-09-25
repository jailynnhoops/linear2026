import java.util.Scanner;

public class task1 {
    public static linkedList CMulti(linkedList l1){
        node head = new node();
        linkedList l2 = new linkedList();
        node curr = l1.head;
        int data = 1;
        while (curr != null){
            //add node to L2
            l2.addTail(curr.num * data);
            //update data
            data = curr.num * data;
            //go to next node
            curr = curr.next;
        }
        return l2;
    }

    public static void main (String[] args){
        //variables
        Scanner scnr = new Scanner(System.in);
        linkedList l1 = new linkedList();
        //initiates a linked list to be created
        System.out.println("Enter a number (0 = stop): ");
        int input = scnr.nextInt();
        //creates additional entries for list, unless 0
        while (input != 0){
            l1.addTail(input);
            //ask for next entry
            System.out.println("Enter a number (0 = stop): ");
            input = scnr.nextInt();
        }

        //call cMulti
        CMulti(l1).printList();

    }
}