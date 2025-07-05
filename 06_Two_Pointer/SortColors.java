import java.util.*;
class SortColors{
    public static void sortColors(int[] arr){
        int low = 0, high = arr.length-1, mid = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        sc.close();
    }
}