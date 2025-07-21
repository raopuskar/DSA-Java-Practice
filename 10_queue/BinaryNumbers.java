import java.util.*;

// A binary representaion of numbers is a sequence of 0s and 1s.
// The binary representation of a number N is the sequence of bits that represents the number in base 2. 
//For example, the binary representation of 5 is 101, and for 10 it is 1010.

public class BinaryNumbers {
    public static void generateBinary(int N) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < N; i++) {
            String curr = q.poll();
            System.out.println(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);
    }
}
