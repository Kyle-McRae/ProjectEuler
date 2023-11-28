public class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int prev = 1;
        int cur = 2;
        while (cur < 4000000) {
            if (cur % 2 == 0) {
                sum += cur;
            }
            cur = cur + prev;
            prev = cur - prev;
        }
        System.out.println(sum);
    }

}