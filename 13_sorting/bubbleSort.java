import java.util.*;
class Solution {
    public int[] bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sol.bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

