class Main {
    public static String reduceTheSize(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                sb.append(arr[i - 1]).append(count);
                count = 1;
            }
        }

        sb.append(arr[n - 1]).append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbbbeeeeffggg";
        System.out.println(reduceTheSize(input, input.length())); // Output: a2b4e4f2g3
    }
}
