import java.util.*;
// This code calculates the power of a number using recursion
// It takes two integers as input: the base and the exponent
class recPower {
    public static int power(int a,int b){
        if(b==0) return 1;
        if(b==1) return a;
        return a*power(a,b-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Power of "+ a +" on "+ b +" is "+ power(a,b));
        sc.close();
    }
}
