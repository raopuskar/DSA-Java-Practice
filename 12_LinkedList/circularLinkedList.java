public public class circularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Point to itself
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circularity
        }
    }

    // Delete a node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head, prev = null;

        // Special case: only one node
        if (head == tail && head.data == value) {
            head = null;
            tail = null;
            return;
        }

        // Deleting head node
        if (head.data == value) {
            tail.next = head.next;
            head = head.next;
            return;
        }

        // General case
        do {
            prev = current;
            current = current.next;

            if (current.data == value) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
        } while (current != head);

        System.out.println("Value not found");
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Main method to test
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);

        cll.printList(); // 10 -> 20 -> 30 -> 40 -> (back to head)

        cll.deleteByValue(30);
        cll.printList(); // 10 -> 20 -> 40 -> (back to head)

        cll.deleteByValue(10);
        cll.printList(); // 20 -> 40 -> (back to head)
    }
}
 {
    
}
