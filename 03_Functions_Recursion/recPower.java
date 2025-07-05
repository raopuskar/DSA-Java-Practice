import java.util.*;

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
