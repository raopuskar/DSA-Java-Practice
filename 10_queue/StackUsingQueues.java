import java.util.*;

public class StackUsingQueues {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q1.add(x);
        }

        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            // Move all but last
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Remove last element (top of stack)
            int top = q1.remove();

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public int top() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int top = q1.remove();
            q2.add(top); // Put it back

            // Swap queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top: " + s.top());   // Output: 30
        System.out.println("Pop: " + s.pop());   // Output: 30
        System.out.println("Top: " + s.top());   // Output: 20
        System.out.println("Is Empty: " + s.empty()); // false
    }
}

