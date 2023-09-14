import java.util.Scanner;

public class RepeatedLetterMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        char[] nameArray = name.toCharArray();
        int  maxCount=0;
        char maxChar=' ';
        for (int i=0;i<nameArray.length;i++){
            int tempCount=1;
            for (int j=i+1; j<nameArray.length;j++){
                if( nameArray[i]==nameArray[j]){
                    tempCount++;
                }
            }
            if (tempCount>maxCount){
                maxCount=tempCount;
                maxChar=nameArray[i];
            }
        }
        System.out.printf("The max count letter is '%s' count is %d",maxChar,maxCount);


    }
}
