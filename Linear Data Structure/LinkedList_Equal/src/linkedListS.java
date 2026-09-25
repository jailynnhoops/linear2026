public class linkedListS {
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
    
    public int count () {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
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

    public boolean equalsLL(linkedListS l1){
        Node curr1 = l1.head;
        Node curr2 = this.head;
        boolean checkEq = true;
        //check the size of the compared lists
        int n1 = l1.count();
        int n2 = this.count();

        //cycle through the values of each list
        if (n1 == n2) {
            while (curr1 != null && curr2 != null){
                if (curr1.num != curr2.num){
                    checkEq = false;
                    break;
                }
                else {
                    continue;
                }
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

}