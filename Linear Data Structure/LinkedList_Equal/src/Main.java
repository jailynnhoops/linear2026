import java.util.Scanner;

public class Main {
    public static boolean EqualsLL(linkedListS l1, linkedListS l2){
        boolean checkEq = false;
        Node curr1 = l1.getHead();
        Node curr2 = l2.getHead();

        //check the size of the compared lists
        int n1 = l1.count();
        int n2 = l2.count();

        //cycle through the values of each list
        if (n1 == n2) {
            while (curr1 != null && curr2 != null){
                if (curr1.num == curr2.num){
                    checkEq = true;
                    continue;
                }
                else {
                    checkEq = false;
                    break;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            //reason for leaving while loop
            if (curr1 != null || curr2 !=null){
                return false;
            }
            else {
                //both lists are the same size
                return true;
            }
        }
        return checkEq;
    }

    public static void main(String[] args){
        //TODO Auto-generate method stub
        Scanner scnr = new Scanner(System.in);
        linkedListS l1 = new linkedListS();
        linkedListS l2 = new linkedListS();

        System.out.print("Please enter a number: 0 to stop");
        int data = scnr.nextInt();

        while (data != 0){
            l1.addTail(data);
            l2.addTail(data);

            System.out.println("Please enter a number: 0 to stop");
            data = scnr.nextInt();
        }

        //Print both lists
        System.out.println("Items for l1 are:");
        l1.printList();
        System.out.println("Items for l2 are:");
        l2.printList();

        //Checking from within Main
            boolean match = equalsLL(l1, l2);

            if (match == true){
                System.out.println("The list values are equal");
            } 
            else {
                System.out.println("The list values are not equal");
            }
        
        //Checking from LinkedList Class

    }
}
