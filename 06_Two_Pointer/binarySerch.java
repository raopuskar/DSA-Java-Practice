import java.util.*;

class Main {
    public static void binarySrch(int[] arr,int low,int high,int target) {
        Arrays.sort(arr); // optional if you want to ensure sorting
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                System.out.print("Target found at index "+ mid);
                return;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("Target not found in the array.");
        
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
        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();

       binarySrch(arr,0,n-1,target);
        sc.close();
    }
}
