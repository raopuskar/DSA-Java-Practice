import java.util.*;

public class circularQueue {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1 ;
        }
        
        public static boolean isFull() {
            return (rear+1)%size == front ;
        }

        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int item = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return item;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();           // Output: Queue: 1 2 3
        System.out.println("Dequeued: " + q.dequeue()); // Output: 1
        q.display();           // Output: Queue: 2 3
        System.out.println("Peek: " + q.peek());       // Output: 2
    }
}
