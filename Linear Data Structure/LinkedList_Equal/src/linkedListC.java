public class linkedListC {
    Node head = null;
    Node tail = null;

    public void addTail (int data){
        Node curr = new Node(data);
    }

    public void deleteTail(){
        if (this.isEmpty()){
            System.out.println("Circular Linked List is Empty. Nothing to Delete");
            System.exit(1);
        }
        else if (head.next == head){
            head = null;
            tail = null;
        }
        else {
            Node curr = head;
            while (curr.next != tail){
                curr = curr.next;
            }
            curr.next = head;
            tail = curr;
        }
    }

    public void addHead(int data){
        Node curr = new Node(data);
        if (this.isEmpty()){
            head = curr;
            tail = curr;
            head.next = head;
        }
        else {
            curr.next = head;
            tail.next = curr;
            head = curr;
        }
    }

    public void deleteHead(){
        if (this.isEmpty()){
            System.out.println("Circular Linked List is Empty. Nothing to Delete");
        }
        else if (head.next == head) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            tail.next = head;
            // tail.next = head.next;
            // head = head.next;
        }
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void printList(){
        
    }
}
