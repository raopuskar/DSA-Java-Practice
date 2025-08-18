class twoRepeatedElement {
    public static int[] twoRepeated(int[] arr) {
        int n = arr.length - 2; 
        int[] freq = new int[n + 1]; 
        int[] result = new int[2];
        int idx = 0;

        for (int num : arr) {
            freq[num]++;
            if (freq[num] == 2) {
                result[idx++] = num;
                if (idx == 2) break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1}; // Example input
        int[] repeated = twoRepeated(arr);
        System.out.println("The two repeated elements are: " + repeated[0] + " and " + repeated[1]);
    }
}
