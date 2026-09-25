
import java.util.Scanner;



public class Main {
    //Returns true if the given number is in the linked list
    public static boolean findNum (Node pointer, int num) {
        boolean found = false;
        Node curr = pointer;
        //cycles through the list and compares each number to the given number
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

    //Find and return the last Note data
    public static Node lastPointer (Node pointer) {
        Node curr = pointer;
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    //Count the total number of Nodes in the linked list
    public static int countLL (Node pointer) {
        int count = 0;
        while (pointer != null ) {
            count++;
            pointer = pointer.next;
        }
        return count;
    }

     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Node top = null;
        Node last = null;
        Node head = null;
        Node tail = null;

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

        Node curr = top;
        while (curr != null) {
            System.out.println(curr.num + "");
            curr = curr.next;
        }

        System.out.println("REVERSE:");
        System.out.println("enter a number (0 - stop): ");
        int rdata = scnr.nextInt();

        //loop until the user give a 0, but build the list along
        while (rdata != 0) {
            Node rnp = new Node(rdata);

            //check if list is empty
            if (head == null) {
                head = rnp;
                tail = rnp;
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



        //test countLL
        System.out.println("The count of the elements in the list is: " + countLL(top));

        System.out.println("Enter a number to search for in the list: ");
        int num = scnr.nextInt();
        boolean found = findNum(top, num);
        if (found == true) {
            System.out.println("The number " + num + " was found in the list.");
        }
        else {
            System.out.println("The number " + num + " was not found in the list.");
        }

        System.out.println("The last pointer in the list is: " + lastPointer(top).num);

        LinkedList l1 = new LinkedList;
        LinkedList l2 = new LinkedList;
        Node cNode = null;
    }
}