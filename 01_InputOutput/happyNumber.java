class happyNumber {
    public boolean isHappy(int n) {

        while(n != 1 && n != 4){ // we use 4 because it enters into a infinite loop 
                                 //4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
            int sum = 0;
            while(n != 0){
                int last = n % 10;
                sum += last*last;
                n /= 10;
            }
            n = sum;
        }

        return (n == 1);
        
    }
    public static void main(String args[]){
        happyNumber obj = new happyNumber();
        int n = 19;
        if(obj.isHappy(n)){
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }
}