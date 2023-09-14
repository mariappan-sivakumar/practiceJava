import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the Word");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        String word1 = "";
        String word2="";
        for(int i=0; i<word.length()/2;i++){
            word1+=word.charAt(i);
        }
        for (int i = word.length()-1; i >=word.length()/2; i--) {
            word2+=word.charAt(i);
        }
        if (word1.equals(word2)){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not Palindrome");
        }
    }
}
