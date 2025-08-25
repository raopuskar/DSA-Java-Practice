// User function Template for Java

class Solution {

    String roundToNearest(String s) {
        int n = s.length();
        char last = s.charAt(n - 1);

        // Case 1: Last digit < 5 → round down
        if (last < '5') {
            return s.substring(0, n - 1) + "0";
        }

        // Case 2: Last digit == 5 → round down (choose smaller multiple)
        if (last == '5') {
            return s.substring(0, n - 1) + "0";
        }

        // Case 3: Last digit > 5 → round up
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(n - 1, '0');

        int i = n - 2;
        while (i >= 0 && sb.charAt(i) == '9') {
            sb.setCharAt(i, '0');
            i--;
        }

        if (i >= 0) {
            sb.setCharAt(i, (char)(sb.charAt(i) + 1));
        } else {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}
