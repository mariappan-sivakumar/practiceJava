public class Day3 {
    public static void main(String[] args) {
//        multiplication(2);
//        System.out.println();
//        multiplication(4,15);
//        System.out.println();
//        primeFactor(30);
        System.out.println(fibonacciSeries(6));
    }
    public static void multiplication(int number, int count) {

        if (count != 1) {
            int count1=count-1;
            multiplication(number, count1);
            System.out.printf("%d x %d = %d%n", count, number, count * number);
        }

    }
    public static void multiplication(int number){
        multiplication(number,10);
    }
    public static void primeFactor(int n){
        System.out.println(1);
        for(int i=2;i<=n;i++){
            if(n%i==0){
                prime(i);
//                System.out.println(i);
            }
        }
    }
    public static void prime(int n){
        boolean isPrime=true;
        for (int i=2;i<n;i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }

        }
        if(isPrime){
            System.out.println(n);
        }
    }
    public static int fibonacciSeries(int n){
        int ans=0;
        if(n==0){
            ans=0;
        } else if (n == 1) {
            ans=1;
        } else if (n > 1) {
            ans=fibonacciSeries(n-1)+fibonacciSeries(n-2);
        }
        return ans;
    }
}
