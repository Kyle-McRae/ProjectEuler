public class Problem5 {
    public static void main(String[] args) {
        int n = 20;
        while (true) {
            boolean works = true;
            for (int i = 2; i <= 20; i++) {
                if (n % i != 0) {
                    works = false;
                }
            }
            if(works){
                System.out.println(n);
                break;
            }
            n++;
        }

    }
}