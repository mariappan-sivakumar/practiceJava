import java.util.Scanner;

public class PushZeroBack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int lengthOfArray=scanner.nextInt();
        int[] array = new int[lengthOfArray];
        int count=0;
        for (int i=0;i<lengthOfArray;i++){
            System.out.print("Enter the Element: ");
            int number= scanner.nextInt();
            if (number!=0){
                array[count]=number;
                count++;
            }
        }
        while (array.length < lengthOfArray){
            array[count]=0;
            count++;
        }

        for (int i:
             array) {
            System.out.print(i+" ");
        }
    }

}
