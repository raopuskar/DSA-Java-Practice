import java.util.*;

public class QueueUsingStacks {
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Add element to the end of the queue
        public void enqueue(int x) {
            s1.push(x);
        }

        // Remove the element from the front of the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        // Get the front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        // Return whether the queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());     // Output: 10
        System.out.println("Removed: " + q.dequeue()); // Output: 10
        System.out.println("Removed: " + q.dequeue()); // Output: 20
        System.out.println("Front: " + q.peek());     // Output: 30
    }
}
