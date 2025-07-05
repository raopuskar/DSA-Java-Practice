import java.util.Scanner;
public class welcomeMsg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yourr name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(name.equals("Puskar") && age == 21){
            System.out.println("Welcome to the Java Programming World, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "! You are not welcome.");  
        }
        sc.close();
    }
    
}
