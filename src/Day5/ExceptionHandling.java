package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {


        try {
            String a = null; //null value
            System.out.println(a.charAt(0));}
        catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
        try {
            String b = "This is like chipping "; // length is 22
            char c = b.charAt(24); // accessing 25th element
            System.out.println(c);}
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        try {
//             Following file does not exist
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);}
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        try {
//             "mari" is not a number
            int num = Integer.parseInt ("Mari") ;}
        catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        try {
            int[] d = new int[5];
            d[6] = 9; // accessing 7th element in an array of size 5
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index is Out Of Bounds");
            }
        try {
            Hashtable exampleTable = new Hashtable();
            exampleTable.elements().nextElement();
        }
        catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception");}
        try {
            Class.forName("Class1");   // Class1 is not defined
            System.out.println("Try-Catch block finished");

        }
        catch (ClassNotFoundException e) {
            System.out.println("Class Not Found...");
        }
//        For FileNotFoundException and CLassNotFoundException declaration,
//        we have to declare a corresponding statement in the try block other wise it does not work
//        print(17);
//        If the try block have the exception it will capture by its exception handling and exit the try block
//        and execute the below line and the function next to the line also throw exception
//        after that exception the code will terminates
        print(18);
        print(10, 11);
        print(-11, 10);
    }

    public static void print(int a) {
        if (a >= 18) {
            System.out.println("Eligible for Voting");
        } else {

            throw new IllegalArgumentException("Not Eligible for Voting");
        }
    }

    public static void print(int a, int b) {
        if (a >= 0 && b >= 0) {
            System.out.println("Addition of Positive Integers :" + (a + b));
        } else {
            throw new IllegalStateException("Either one or two numbers are not Positive Integer");
        }
    }
}
