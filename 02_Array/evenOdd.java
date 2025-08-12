import java.util.*;
class evenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.print("Entered number is EVEN");
        }else{
            System.out.print("Entered number is ODD");
        }
        sc.close();
    }
}