package Day7;

import java.util.Arrays;
import java.util.Comparator;
class Student {
    int roll;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.roll = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.roll + " "
                + this.name + " "
                + this.address;
    }

}

public class SortByComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        return s1.roll-s2.roll;
    }
}
class Main {
    public static void main(String[] args)
    {
        Student[] arr = { new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

//        Arrays.sort(arr, 1, 2, new SortByComparator());
        Arrays.sort(arr,  new SortByComparator());
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
