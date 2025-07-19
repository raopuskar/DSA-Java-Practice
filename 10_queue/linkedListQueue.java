public class linkedListQueue {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front = null;      //front or head of the queue
        Node rear = null;       //rear or tail of the queue

        // Enqueue operation
        void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;    
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue operation
        int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return val;
        }

        // Peek operation
        int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Display operation
        void display() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Check if queue is empty
        boolean isEmpty() {
            return front == null;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Queue: 10 20 30
        System.out.println("Dequeued: " + q.dequeue()); // 10
        q.display(); // Queue: 20 30
        System.out.println("Peek: " + q.peek()); // 20
    }
}
