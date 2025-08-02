public class DoublyLinkedList {
    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete by value
    public void deleteByValue(int data) {
        Node curr = head;

        while (curr != null && curr.data != data) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Value not found");
            return;
        }

        if (curr == head) {
            head = curr.next;
            if (head != null) head.prev = null;
            else tail = null; // List becomes empty
        } else if (curr == tail) {
            tail = curr.prev;
            tail.next = null;
        } else {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
    }

    // Print forward
    public void printForward() {
        Node curr = head;
        System.out.print("Forward: ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Print backward
    public void printBackward() {
        Node curr = tail;
        System.out.print("Backward: ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10);
        dll.insertAtHead(5);
        dll.insertAtTail(20);
        dll.insertAtTail(25);

        dll.printForward();   // 5 <-> 10 <-> 20 <-> 25 <-> null
        dll.printBackward();  // 25 <-> 20 <-> 10 <-> 5 <-> null

        dll.deleteByValue(20);
        dll.printForward();   // 5 <-> 10 <-> 25 <-> null
    }
}
