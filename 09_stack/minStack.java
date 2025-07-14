import java.util.*;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {
        stack.push(val);
        // Push to minStack if it's empty or val <= current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element from stack
    public void pop() {
        int popped = stack.pop();
        // If the popped element is the current minimum, pop from minStack too
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top element
    public int top() {
        return stack.peek();
    }

    // Retrieve the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        
        System.out.println("Current Min: " + minStack.getMin());  // Output: -3
        
        minStack.pop();
        
        System.out.println("Top Element: " + minStack.top());     // Output: 0
        System.out.println("Current Min: " + minStack.getMin());  // Output: -2
    }
}
