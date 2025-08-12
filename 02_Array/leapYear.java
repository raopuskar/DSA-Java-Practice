import java.util.Scanner;
class leapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(( x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)){
            System.out.print("Entered year is leap year");
        }else{
            System.out.print("Not a leap year");
        }
        sc.close();
    }
}