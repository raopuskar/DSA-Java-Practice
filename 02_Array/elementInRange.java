// User function Template for Java
import java.util.HashSet;
class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(arr[i] >= A && arr[i]<= B){
                set.add(arr[i]);
            }
        }
        
        return set.size() == (B-A+1);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int A = 1;
        int B = 5;
        
        boolean result = sol.check_elements(arr, n, A, B);
        System.out.println("All elements from " + A + " to " + B + " are present: " + result);
    }
}


//This checks if all elements in the range [A, B] are present in the given array.