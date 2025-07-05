// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CompressString {
    public static void compresString(String str1,StringBuilder str2){
        int count = 0;
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            count++;
            if (i + 1 >= str1.length() || str1.charAt(i + 1) != ch) {
                str2.append(ch).append(count);
                count = 0;
            }
        }
        System.out.print(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder(); // we use StringBuilder for efficient string manipulation like appending characters 
        compresString(str1, str2);                // because String is immutable in Java, so using StringBuilder is more efficient for concatenation
        sc.close();
    }
}