import java.util.*;
class Factorial{
    public static int factorial(int n){
        int result = 1;
        for(int i=n;i>0;i--){
            result = i*result;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
        sc.close();
    }
}