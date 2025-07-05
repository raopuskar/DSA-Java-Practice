import java.util.*;
class AddFunction {
    public static void addFunction(int a, int b){
        System.out.print("Sum is "+ (a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        addFunction(a,b);
        sc.close();
    }
}