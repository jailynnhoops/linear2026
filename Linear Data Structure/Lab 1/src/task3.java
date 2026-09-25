import java.util.Scanner;
import java.util.HashSet;

public class task3 {
    public static boolean isSubset(linkedList l1, linkedList l2) {
        node curr1 = l1.head;
        node curr2 = l2.head;
        int count1 = 0;
        int count2 = 0;
        HashSet<Integer> hash1 = new HashSet<Integer>();
        HashSet<Integer> hash2 = new HashSet<Integer>();

        while (curr1 != null){
            count1++;
            hash1.add(curr1.num);
            curr1 = curr1.next;
        }
        while (curr2 != null){
            count2++;
            hash2.add(curr2.num);
            curr2 = curr2.next;
        }

        curr1 = l1.head;
        curr2 = l2.head;

        if (count1 > count2){
            while (curr2 != null){
                if (!hash1.contains(curr2.num)) {
                    return false;
                }
                curr2 = curr2.next;
            }
        }
        else {
            while (curr1 != null){
                if (!hash2.contains(curr1.num)) {
                    return false;
                }
                curr2 = curr2.next;
            }
        }

        return true;
    }
     public static void main (String[] args) {
        //variables
        Scanner scnr = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        //initiates a linked list to be created
        System.out.println("LIST 1");
        System.out.println("Enter a number (0 = stop): ");
        int input = scnr.nextInt();
        //creates additional entries for list, unless 0
        while (input != 0){
            l1.addTail(input);
            //ask for next entry
            System.out.println("Enter a number (0 = stop): ");
            input = scnr.nextInt();
        }

        System.out.println("LIST 2");
        System.out.println("Enter a number (0 = stop): ");
        input = scnr.nextInt();
        //creates additional entries for list, unless 0
        while (input != 0){
            l2.addTail(input);
            //ask for next entry
            System.out.println("Enter a number (0 = stop): ");
            input = scnr.nextInt();
        }
        System.out.print(isSubset(l1,l2));
    }
}
