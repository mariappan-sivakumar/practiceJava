import java.util.Arrays;
import java.util.Scanner;

public class HashedNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number%sumDigit(number)==0){
            System.out.println("The given number is Hashed Number");
        }
        else {
            System.out.println("The Given number is not Hashed Number");
        }
    }
    public static int sumDigit(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
