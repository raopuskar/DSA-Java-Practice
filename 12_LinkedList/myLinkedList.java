public class myLinkedList {
    // Node class
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head pointer
    private Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Insert at specific position (0-based index)
    public void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Delete by value
    public void deleteByValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != data) {
            curr = curr.next;
        }
        if (curr.next == null) {
            System.out.println("Value not found.");
            return;
        }
        curr.next = curr.next.next;
    }

    // Delete at specific position (0-based index)
    public void deleteAtPosition(int pos) {
        if (head == null) return;

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        curr.next = curr.next.next;
    }

    // Print the linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Get length of the list
    public int getLength() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.printList(); // 10 -> 20 -> 30 -> null

        list.insertAtHead(5);
        list.printList(); // 5 -> 10 -> 20 -> 30 -> null

        list.insertAtPosition(15, 2);
        list.printList(); // 5 -> 10 -> 15 -> 20 -> 30 -> null

        list.deleteByValue(10);
        list.printList(); // 5 -> 15 -> 20 -> 30 -> null

        list.deleteAtPosition(2);
        list.printList(); // 5 -> 15 -> 30 -> null

        System.out.println("Length: " + list.getLength()); // 3
    }
}

// Explanation:
// 1. The Node class represents each element in the linked list, containing data and a pointer to the next node.
// 2. The MyLinkedList class manages the linked list with a head pointer and provides methods for insertion, deletion, printing, and length calculation.        
  

