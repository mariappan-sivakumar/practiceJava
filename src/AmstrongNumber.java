import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
//        amstrong();
        amstrongRange();

    }
    public static boolean isAmstrong(int n){
        int n2=n;
        int sum=0;
        int temp1=n2;
        int pow=0;
        while (temp1!=0){
            pow++;
            temp1/=10;
        }
        while (n2!=0){
            int temp=n2%10;
            sum+=Math.pow(temp,pow);
            n2/=10;
        }
        boolean res=n==sum;
        return res;
    }
    public static void amstrong(){
        System.out.printf("Enter the number to find Amstrong Number: ");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if (isAmstrong(number)){
            System.out.println("The given number is Amstrong");
        }
        else {
            System.out.println("the given number is not");
        }
    }
    public static void amstrongRange(){
        Scanner scanner=new Scanner(System.in);
        int startNumber=scanner.nextInt();
        int lastNumber=scanner.nextInt();
        while (startNumber<lastNumber){
            if (isAmstrong(startNumber)){
                System.out.println(startNumber);
            }
            startNumber++;
        }
    }
}
