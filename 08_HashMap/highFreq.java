import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the all the array element:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        //creare a hast function
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        
        for(int i: arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);   //ye line will check if the key is present in the map, if not it will return 0 and then add 1 to it
        }
        
        // Step 2: Find the max frequency
        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        
        // Step 3: Print all numbers with the max frequency
        System.out.println("Number(s) with the highest frequency:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {   //ye line will iterate through the map and get the key and value
            // If the frequency of the number is equal to maxFreq, print it
            if (entry.getValue() == maxFreq) {
                System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }

        sc.close();


    }
}