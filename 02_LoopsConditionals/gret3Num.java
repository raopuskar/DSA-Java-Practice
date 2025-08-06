import java.util.Scanner;
class evenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter sec number:");
        int b =sc.nextInt();
        System.out.print("Enter third number:");
        int c = sc.nextInt();
        
        if( a > b && a > c){
            System.out.println("Greates is "+ a);
            if(b>c){
                System.out.print("Second Greates is "+b);
            }else{
                System.out.print("Second Greates is "+c);
            }
        }else if(b > a && b > c){
            System.out.println("Greates is "+ b);
            if(a>c){
                System.out.print("Second Greates is "+a);
            }else{
                System.out.print("Second Greates is "+c);
            }
        }else if(c > a && c > b){
            System.out.println("Greates is "+ c);
            if(b>a){
                System.out.print("Second Greates is "+b);
            }else{
                System.out.print("Second Greates is "+a);
            }
        }
        sc.close();
    }
}

// other best way to find greatest and second greatest number