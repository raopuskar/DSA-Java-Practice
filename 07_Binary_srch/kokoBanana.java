import java.util.*;
class Solution {
    public static int canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double)pile / k);  // time to finish each pile
        }
        return hours;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while(low <= high){
            int mid = low + (high-low)/2;
            int totalHour = canEatAll(piles,h,mid);
            if(totalHour<= h){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }
}