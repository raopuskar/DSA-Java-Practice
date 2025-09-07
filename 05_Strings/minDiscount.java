import java.util.*;

class minDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of items
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] items = new String[n];
        int[] discounts = new int[n];

        // Read item details
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            items[i] = parts[0].trim(); // item name
            discounts[i] = Integer.parseInt(parts[2].trim()); // discount
        }

        // Find minimum discount
        int minDiscount = discounts[0];
        for (int i = 1; i < n; i++) {
            if (discounts[i] < minDiscount) {
                minDiscount = discounts[i];
            }
        }

        // Print items with minimum discount
        for (int i = 0; i < n; i++) {
            if (discounts[i] == minDiscount) {
                System.out.println(items[i]);
            }
        }

        sc.close();
    }
}




// Sample Input:
// 3
// Laptop,1000,10
// Phone,500,5
// Tablet,300,5
// Sample Output:
// Phone
// Tablet
// Explanation: The minimum discount is 5, which is offered on Phone and Tablet.

