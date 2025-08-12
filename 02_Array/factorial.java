import java.util.Scanner;

public class factorial {
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }else
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = Factorial(5);
        System.out.println("Factorial of " + 3 + " is: " + result);
        input.close();
    }
}
