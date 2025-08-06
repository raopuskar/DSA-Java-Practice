// This program swaps two numbers without using a third variable
import java.util.*;
class swapThirdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = sc.nextInt();
        System.out.print("Enter value of b:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("Value of a is " + a + " and b is " + b);
        sc.close();
        
    }
}

//with third variable
// class swapThirdVar {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of a:");
    //     int a = sc.nextInt();
    //     System.out.print("Enter value of b:");
    //     int b = sc.nextInt();
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.print("Value of a is " + a + " and b is " + b);
    //     sc.close();
        
    // }
//}   