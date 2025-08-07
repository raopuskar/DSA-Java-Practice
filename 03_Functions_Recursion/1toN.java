class OneToN {
    public static void printNumbers(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Printing 1 to " + n + ":");
        printNumbers(1, n);
    }
}
