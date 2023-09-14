package Day8;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("A");
        linkedList.add("B"); //add element at the end
        linkedList.addLast("C"); //add element at the last
        linkedList.addFirst("D"); //add element at the start
        linkedList.add(2, "E"); // add element in the specified index
        linkedList.add("E");
        linkedList.add("A");

        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getClass());

        linkedList.remove("B"); //remove element
        linkedList.remove(3); //remove element at index
        linkedList.removeFirstOccurrence("E");//Remove first occurrence of the specified element
        linkedList.removeLastOccurrence("A");
        linkedList.removeFirst(); // remove the first element
        linkedList.removeLast(); //remove the last element
        System.out.println(linkedList);

        linkedList.set(0, "For"); //change element in index 0
        linkedList.offer("Q"); //add element in the end and return true if the element is successfully added
        linkedList.offerFirst("R"); //add element in the first
        linkedList.offerLast("ads"); //add element in the last
        linkedList.push("abc"); //push the element onto the linked list in start
        System.out.println(linkedList);

        System.out.println(linkedList);
        System.out.println(linkedList.element()); //return first element and not del it
        System.out.println(linkedList.peek()); //return first element and not del it
        System.out.println(linkedList.peekFirst()); //return first element and not del it
        System.out.println(linkedList.peekLast()); //return last element and not del it
        System.out.println(linkedList);

        System.out.println(linkedList.poll()); //return first element and remove it
        System.out.println(linkedList.poll()); //return null if the list is empty
        System.out.println(linkedList.pollFirst()); //return first element and remove it and return null if empty
        System.out.println(linkedList.pollLast()); //return last element and remove it and return null if empty
        System.out.println(linkedList.pop()); //return first element and remove it if the list is empty throw error
        System.out.println(linkedList);

    }
}
