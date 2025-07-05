import java.util.*;
class Palindrom {
    public static boolean palindrom(String str,int start,int end){
        if(start >= end){
            return true;
        }

        if(str.charAt(start) == str.charAt(end)){
            return palindrom(str,start+1,end-1);
        }
        return false;
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        boolean result = palindrom(str,0,str.length()-1);
        if(result){
            System.out.print("Planidrom string");
        }else{
            System.out.print("Not Palindrom");
        }
        sc.close();
    }
}