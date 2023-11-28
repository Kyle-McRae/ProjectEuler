public class Problem4 {
    public static void main(String[] args) {
        int highest = 0;
        int highI = 0;
        int highJ = 0;
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                if(palindrome(i*j) && i*j > highest){
                    highest = i*j;
                    highI = i;
                    highJ = j;
                }
            }
        }
        System.out.println(highest + " " + highI + " " + highJ);
    }
    public static boolean palindrome(int n){
        // boolean palindrome = true;
        // int num = n;
        // int digits = 0;
        // while(num > 0){
        //     num /= 10;
        //     digits++;
        // }
        // for(int i = 0; i < digits/2; i++){
        //     int smaller = (n / (int)Math.pow(10, i)) % 10;
        //     int bigger = (n / (int)Math.pow(10, digits-i-1)) % 10;
        //     if(smaller != bigger){
        //         palindrome = false;
        //     }
        // }
        // return palindrome;

        int reversed = 0;
        int temp = n;
        while(temp > 0){
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }
        return (reversed == n);
    }
}