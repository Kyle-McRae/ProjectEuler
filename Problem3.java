public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long factor = 2;
        while(factor < num){
            while(num%factor == 0){
                num /= factor;
            }
            factor++;
        }
        System.out.println(num);
    }

}