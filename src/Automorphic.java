import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int squareNumber=number*number;
        int temp=number;
        int digit=1;
        while (temp!=0){
            temp=temp/10;
            digit*=10;
        }
        if(number==squareNumber%digit){
            System.out.println("It is Automorphic Number");

        }
        else {
            System.out.println("It is not Automorphic Number");

        }

    }
}