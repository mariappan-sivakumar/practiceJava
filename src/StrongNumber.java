import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to check strong number: ");
        int number=sc.nextInt();
        if(number==result(number)){
            System.out.println("Given Number is Strong Number");
        }
        else {
            System.out.println("Given number is not Strong number");
        }

    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int result(int n){
        int sumFact=1;
        int out=0;
        while (n!=0){
            out+=factorial(n%10);
            n/=10;
        }
        return out;
    }
}
