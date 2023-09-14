import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number<sumOfDivison(number)){
            System.out.println("Abundant Number");
        }
        else {
            System.out.println("Not Abundant number");
        }
    }
    public static int sumOfDivison(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if (n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
