import java.util.Scanner;
class reverseArrat {
    public static void reverseArray(char[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
         
        for(char i : arr){
            System.out.print(i+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter all the " + n + " array");
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        reverseArray(arr);
    }
}