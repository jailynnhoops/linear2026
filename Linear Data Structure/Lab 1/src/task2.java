import java.util.Scanner;

public class task2 {
    public static linkedList unsortedList (linkedList l1, linkedList l2){
        node curr1 = l1.head;
        node curr2 = l2.head;
        linkedList lMerge = new linkedList();

        while (curr1 != null && curr2 != null){
            lMerge.addTail(curr1.num);
            lMerge.addTail(curr2.num);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while (curr1 != null){
            lMerge.addTail(curr1.num);
            curr1 = curr1.next;
        }
        while (curr2 != null){
            lMerge.addTail(curr2.num);
            curr2 = curr2.next;
        }
        return lMerge;
    }
    public static void main (String[] args) {
        //variables
        Scanner scnr = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        //initiates a linked list to be created
        System.out.println("List 1 Creation");
        System.out.println("Enter a number (0 = stop): ");
        int input = scnr.nextInt();
        //creates additional entries for list, unless 0
        while (input != 0){
            l1.addTail(input);
            //ask for next entry
            System.out.println("Enter a number (0 = stop): ");
            input = scnr.nextInt();
        }

        System.out.println("LIST 1 CREATION");
        System.out.println("Enter a number (0 = stop): ");
        input = scnr.nextInt();
        //creates additional entries for list, unless 0
        while (input != 0){
            l2.addTail(input);
            //ask for next entry
            System.out.println("Enter a number (0 = stop): ");
            input = scnr.nextInt();
        }

        unsortedList(l1, l2).printList();
    }
}
