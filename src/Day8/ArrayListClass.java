package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class ArrayListClass {
    public static void main(String[] args) {

        // Creating an object of List interface implemented by the ArrayList class
        List<Integer> l1 = new ArrayList<>();

        // Adding elements to object of List interface Custom inputs

        l1.add(0, 1);
        l1.add(1, 2);

        // Print the elements inside the object
        System.out.println(l1);

        // Now creating another object of the List interface implemented ArrayList class Declaring object of integer type
        List<Integer> l2 = new ArrayList<>();

        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);

        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);

        // Printing the updated List 1
        System.out.println(l1);

        // Prints element at index 3 in list 1 using get() method
        System.out.println(l1.get(3));

        // Replace 0th element with 5  in List 1
        l1.set(0, 5);
        l1.add(1);
        // Again printing the updated List 1
        System.out.println(l1);

        System.out.println("The first occurrence of 2 is at index " + l1.indexOf(2));
        System.out.println("The last occurrence of 2 is at index " + l1.lastIndexOf(2));
        System.out.println("Does the list have 1: " + l1.contains(1));
//      using for loop with list
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
//      for each method in list
        for (int i : l1) {
            System.out.println(i);
        }
        l2.clear();

        System.out.println("After clearing list2: " + l2);
        System.out.println("does the List2 is empty "+l2.isEmpty());
        System.out.println("Does List1 and 2 are equal: " + l1.equals(l2));
        l2.addAll(l1);
        System.out.println("Does List1 and 2 are equal: " + l1.equals(l2));
        int a=l2.hashCode();
        int b=l1.hashCode();
        boolean c=a==b;
        System.out.println("Does List1 and list 2 have equal hashcode: "+c);
        l2.add(1);
        System.out.println("Des List1 and 2 are equal: " + l1.equals(l2));
        a=l2.hashCode();
        c=a==b;
        System.out.println("Does List1 and list 2 have equal hashcode: "+c);
        System.out.println("We can store different datatype element in a single list");
//we can store multiple datatype in single list for that we don't declare the object type next to the List
        List<Object> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5.1);
        list.add("daf");
        System.out.println(list);

//        Vector
        System.out.println("Vector list");
        // Size of the vector
        int n = 5;

        // Declaring the List with initial size n
        List<Integer> v = new Vector<>(n);

        // Appending the new elements at the end of the list
        for (int i = 1; i <= n; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the list after deletion
        System.out.println(v);

        // Printing elements one by one
        for (Integer integer : v) System.out.print(integer + " ");
    }
}
