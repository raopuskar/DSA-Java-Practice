import java.util.*;
class SumOfDigits {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;//last digit ko sum me add karega
            n /= 10; //last digit ko hata dega
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.print(sum);
        sc.close();
    }
}