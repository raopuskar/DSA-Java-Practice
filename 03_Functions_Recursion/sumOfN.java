import java.util.*;

class SumOfN {
    public static int sum(int a){
        if(a==0) return 0;
        if(a==1) return 1;
        return a + sum(a-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(sum(a));
        sc.close();
    }
}
