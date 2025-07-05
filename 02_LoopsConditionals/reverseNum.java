import java.util.Scanner;

public class reverseNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0){
            int lastDgt = num % 10;
            reverse = reverse*10 + lastDgt;         
            num /= 10;  //remove last degit
        }
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}