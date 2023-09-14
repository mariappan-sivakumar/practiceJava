package Day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        doTimings("ArrayList",arrayList);
        doTimings("Linked List",linkedList);
        doTimings1("Linked List",linkedList);
        doTimings1("ArrayList",arrayList);
    }
    private static void doTimings(String type, List<Integer> list){
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long stop=System.currentTimeMillis();
        System.out.println("Time taken for "+ type+" to add element at end is "+(stop-start));
    }
    private static void doTimings1(String type, List<Integer> list){
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start=System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++) {
            list.add(0,i);
        }
        long stop=System.currentTimeMillis();
        System.out.println("Time taken for "+ type+" to add element at beginning is "+(stop-start));
    }
}

// We can clearly see that to add element at the end of the list both list(Array List and Linked List)
// take similar timing but to add element in the beginning of the list linked list is better than array list

