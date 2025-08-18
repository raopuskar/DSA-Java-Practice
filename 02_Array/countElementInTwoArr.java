import java.util.*;

class countElementInTwoArr {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(b); // sort b[] for binary search
        
        for (int num : a) {
            int count = upperBound(b, num);
            list.add(count);
        }
        
        return list;
    }

    // finds index of first element greater than x (like C++ upper_bound)
    private static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; // number of elements <= x
    }
}
