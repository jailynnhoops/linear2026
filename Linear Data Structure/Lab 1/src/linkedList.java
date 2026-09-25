//this class is for creating and storing linked lists
public class linkedList {
    node head = null;
    //Adds elements to the begining of the list
    public void addHead (int input){
        node curr = new node(input);
        if (head == null) {
            head = curr;
        }
        else {
            curr.next = head;
            head = curr;
        }
    }

    //Add items to the end of the list
    public void addTail (int input){
        //creates new element
        node newNode = new node(input);
        //checks if it is the first entry
        if (head == null) {
            head = newNode;
        }
        //if not first...
        else {
            //set the 'last' entry to the last element in current linked list
            node curr = head;
            //looks through the linked list
            while (curr.next != null) {
                //sets curr to the next entry
                curr = curr.next;
            }
            //tells last node to point to the new element
            curr.next = newNode;
        }
    }

    public void printList() {
        node curr = head;
        //looks through full linked list
        while (curr != null) {
            //prints the number entry
            System.out.print(curr.num + " ");
            //moves to the next node
            curr = curr.next;
        }
    }

    public void swap(int i, int j){
        node pre1 = head;
        node pre2 = head;
        node data1 = head;
        node data2 = head;
        
        for (int k = 0; k < i-1; k++){
            pre1 = pre1.next;
        }
        // System.out.println(pre1.num);
        for(int m = 0; m < j-1; m++){
            pre2 = pre2.next;
        }
        // System.out.println(pre2.num);
        for (int n = 0; n < i; n++){
            data1 = data1.next;
        }
        for (int p = 0; p < j; p++){
            data2 = data2.next;
        }
        node temp = pre1.next;
        pre1.next = pre2.next;
        pre2.next = temp;

        temp = data1.next;
        data1.next = data2.next;
        data2.next = temp;
    }
}
