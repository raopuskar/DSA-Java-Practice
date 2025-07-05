import java.util.Scanner;
public class printType {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        if(sc.hasNextInt()){
            int intValue = sc.nextInt();
            System.out.println("You entered an integer: " + intValue);
        } else if(sc.hasNextDouble()){
            double doubleValue = sc.nextDouble();
            System.out.println("You entered a double: " + doubleValue);
        } else {
            String stringValue = sc.next();
            System.out.println("You entered a string: " + stringValue);
        }
        sc.close();
    }
}
