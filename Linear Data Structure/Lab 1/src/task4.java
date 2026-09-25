import java.util.Scanner;
import java.util.HashSet;

public class task4 {
     public static void main (String[] args) {
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

        System.out.print("Enter index 1: ");
        int first = scnr.nextInt();
        System.out.print("Enter index 2: ");
        int second = scnr.nextInt();
        l1.swap(first, second);
        l1.printList();
    }
}
