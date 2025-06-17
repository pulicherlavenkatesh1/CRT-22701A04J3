class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }
    void insertionBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
 class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(50);
        list.printList(); 
        list.insertionBeg(5);
        list.printList();
    }
}
