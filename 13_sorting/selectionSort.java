class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {64, 25, 12, 22, 11};
        sol.selectionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}