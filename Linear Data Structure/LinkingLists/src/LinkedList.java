import Node;

package src;

public class LinkedList {
    Node head = null;

    //method that adds elements to the begining of the list
    public void addHead (int m){
        Node np = new Node(m);
        if (head == null) {
            head = np;
        }
        else{
            np.next = head;
            head = np;
        }
    }

    //Add items to the end of the list
    public void addTail (int m){
        Node np = new Node(m);

        if (head == null) {
            head = np;
        }
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = np; //Attach last node to the new node
        }
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.num + " ");
            curr = curr.next;
        }
    }

    public void isEmpty(){

    }

    public Node getHead(){

    }

    public boolean Equalsll(LinkedList l1){
        
    }
}