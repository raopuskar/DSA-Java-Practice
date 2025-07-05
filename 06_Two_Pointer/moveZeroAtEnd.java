import java.util.*;

class Main {
    public static void moveZeroAtEnd(int[] arr) {
        int index = 0; // Position to place next non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {  //this will move all non-zero elements to the front
                arr[index] = arr[i]; // {0,1,0,3,12} => {1,3,12} and index will be 3
                index++;
            }
        }
        while (index < arr.length) {  //this will fill the rest of the array with zeros from index 3
            arr[index] = 0;           // {1,3,12} => {1,3,12,0,0}
            index++;
        }

        System.out.println("Array after moving zeros to the end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroAtEnd(arr);
        sc.close();
    }
}
