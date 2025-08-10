import java.util.*;
//This code is using Arrays.sort() to find the second greatest element in an array of three numbers.
public class SecondGreatest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the first number:");
        arr[0] = sc.nextInt();
        System.out.print("Enter the second number:");
        arr[1] = sc.nextInt();
        System.out.print("Enter the third number:");
        arr[2] = sc.nextInt();
        
        Arrays.sort(arr);
        
        System.out.println("First Greates element is " + arr[2]);
        System.out.print("Second Greates element is " + arr[1]);
        
        sc.close();
    }
}


//This code is more optimal then the above code without using Arrays.sort() to find the second greatest element in an array of three numbers.

// class Main {
//     public static int secondGreatest(int[] arr,int n){
//         if(n<2){
//             return -1;
//         }
//         int largest = arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }
//         }
//         int secondLargest = -1;
//         for(int i=0;i<n;i++){
//             if(arr[i]>secondLargest && arr[i] != largest){
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {4,1,9,4,0,9,3};
//         int n = arr.length;
//         System.out.print("The second largest is " + secondGreatest(arr,n));
//     }
// }