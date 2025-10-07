//Important code
class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
            if (height[j] > rightMax) {
                rightMax = height[j];
            }
            if (leftMax <= rightMax) {
                if (leftMax - height[i] > 0) {
                    res += leftMax - height[i];
                }
                i++;
            } else {
                if (rightMax - height[j] > 0) {
                    res += rightMax - height[j];
                }
                j--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(sol.trap(height)); // Output: 6
    }
}

//Example
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.