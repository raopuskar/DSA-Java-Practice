public class ArrayQueue {
    private int[] queue;
    private int front, rear, capacity;

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Enqueue - add element to the queue
    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        queue[rear] = item;
    }

    // Dequeue - remove element from the front
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = queue[front];
        front++;
        return item;
    }

    // Peek - view front element
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Display queue contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}





