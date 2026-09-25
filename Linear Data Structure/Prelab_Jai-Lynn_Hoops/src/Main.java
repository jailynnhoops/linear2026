
import java.util.Scanner;
public class Main {
    public static boolean findNum (Node pointer, int num) {
        boolean found = false;
        Node curr = pointer;
        while (curr != null){
            if (curr.num == num) {
                found = true;
                break;
            }
            else{
                curr = curr.next;
            }
        }
        return found;
    }

    public static Node lastPointer (Node pointer) {
        Node curr = pointer;
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    //Part 2 - count the number of nodes that are in the linked listed
    public static int countLL (Node pointer) {
        int count = 0;
        while (pointer != null ) {
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    //Part 1
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Node top = null;
        Node last = null;
        Node head = null;

        System.out.println("enter a number (0 - stop): ");
        int data = scnr.nextInt();
        
        //loop until the user give a 0, but suild the list along
        while (data != 0) {
            Node np = new Node(data);
            //check if list is empty
            if (top == null) {
                top = np;
                last = np;
            }
            else { //find the pointer to the last node before adjusting links
                if (np != null){
                    //connects the new node (np) to the end of the list
                    last.next = np;
                    //updates the 'last' node that was created/connected
                    last = np;
                }
            }
            
            System.out.println("enter a number (0 - stop): ");
            data = scnr.nextInt();
        }

        //Prints the linked list
        Node curr = top;
        while (curr != null) {
            System.out.println(curr.num + "");
            curr = curr.next;
        }

        //Part 5
        System.out.println("REVERSE:");
        System.out.println("enter a number (0 - stop): ");
        int rdata = scnr.nextInt();

        //loop until the user give a 0, but build the list along
        while (rdata != 0) {
            Node rnp = new Node(rdata);

            //check if list is empty
            if (head == null) {
                head = rnp;
            }
            else { //find the pointer to the first node before adjusting links
                    //connects the new node (rnp) to the start of the list and the previous node
                    rnp.next = head;
                    head = rnp;
                    //updates the 'last' node that was created/connected     
            }
            
            System.out.println("enter a number (0 - stop): ");
            rdata = scnr.nextInt();
        }

        Node rcurr = head;
        while (rcurr != null) {
            System.out.println(rcurr.num + "");
            rcurr = rcurr.next;
        }



        //Part 2 Result
        System.out.println("The count of the elements in the list is: " + countLL(top));

        //Part 3
        System.out.println("Enter a number to search for in the list: ");
        int num = scnr.nextInt();
        boolean found = findNum(top, num);
        if (found == true) {
            System.out.println("The number " + num + " was found in the list.");
        }
        else {
            System.out.println("The number " + num + " was not found in the list.");
        }

        //Part 4 - find the last pointer in the linked list
        System.out.println("The last pointer in the list is: " + lastPointer(top).num);
    }
}