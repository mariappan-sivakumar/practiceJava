package Day9;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {

        System.out.println("HashSet");
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the Set using add() method
        hashSet.add("Mari");
        hashSet.add("Balaji");
        hashSet.add("Raj");
        hashSet.add("Jeya");
        hashSet.add("Bharani");
        hashSet.add("Hemantho");

        // Printing elements of HashSet object
        System.out.println(hashSet);
        // since Hashset is unordered collection we get the element placed randomly in set

        // Adding all elements to List
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));

        // Again declaring object of Set class
        // with reference to HashSet

        Set<Integer> b = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));


        // To find union
        Set<Integer> union = new HashSet<>(a); //create a set with the element of other set
        union.addAll(b); //add all element of b set
        System.out.print("Union of the two Set");
        System.out.println(union); // since it doesn't have duplicate value we will get the union of two set

        // To find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);//This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);//This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        // To find union, intersection, difference have all element of "a" or not
        System.out.println("Union: "+union.containsAll(a)+" Intersection: "+intersection.containsAll(a)+" Difference: "+ difference.containsAll(a));


        String check = "Mari";
        // Check if the above string exists in the Hashset or not using contains() method
        System.out.println("Contains " + check + " " + hashSet.contains(check));
        // Removing custom element using remove() method
        hashSet.remove("Bharani");
        // Printing Set elements after removing an element and printing updated Set elements
        System.out.println("After removing element " + hashSet);
        // Iterating in sets
        for (String value : hashSet){
            // Printing all the values inside the object
            System.out.print(value + ", ");}
        System.out.println();
        // Iterating with Iterator interface
        Iterator<String> i = hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        hashSet.clear();
        System.out.println("hashSet after Clear: "+hashSet);
        System.out.println("Check the set is empty hashSet is empty: "+hashSet.isEmpty());
        Object[] array=union.toArray();
        System.out.println(Arrays.toString(array));
        hashSet.add("new element for clone");
        HashSet cloneSet = (HashSet) hashSet.clone();
        System.out.println(cloneSet);
        System.out.println('\n'+"Enumset"+'\n');
        // Enum set is a class that implement set it have the set value of Enum object
        EnumSet<EnumSets> enumSets= EnumSet.of(EnumSets.Mari,EnumSets.Blesson);
        EnumSet<EnumSets> enumSets1= EnumSet.allOf(EnumSets.class);
        EnumSet<EnumSets> enumSets2=EnumSet.complementOf(enumSets);
        EnumSet<EnumSets> enumSets3=EnumSet.range(EnumSets.Mari,EnumSets.ThangaDhinesh);
        System.out.println("Enum Set: "+enumSets);
        System.out.println("Enum Set1: "+enumSets1);
        System.out.println("Enum set2 which contains the element missing in Enum set: "+enumSets2);
        System.out.println("Enum set3 which contains the element in a range"+ enumSets3);


        // LinkedHashSet is a class that implements Set normal hashset does not store the value in
        // an order but linked list store the value in the user given order or order of the value assign to it.
        System.out.println('\n'+"LinkedHashSet"+'\n');
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("India");
        linkedHashSet.add("Pakistan");
        linkedHashSet.add("China");
        linkedHashSet.add("SriLanka");
        linkedHashSet.add("Nepal");
        linkedHashSet.add("Russia");
        System.out.println("Linked hash Set"+linkedHashSet);

        //Treeset is a class that implements set it store the element in the natural order for example if the element is number it store it in an accenting order if th element is string it stores it in alphabetical order
        System.out.println('\n'+"TreeSet"+'\n');
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("Pakistan");
        treeSet.add("China");
        treeSet.add("SriLanka");
        treeSet.add("Nepal");
        treeSet.add("Russia");
        System.out.println("Tree Set"+treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet("China"));
        System.out.println(treeSet.headSet("India"));
        System.out.println(treeSet.tailSet("Russia"));
        System.out.println(treeSet.higher("Nepal"));
        System.out.println(treeSet.lower("Nepal"));
        System.out.println(treeSet.subSet("India","Russia"));
        System.out.println(treeSet.ceiling("Mari"));
        System.out.println(treeSet.floor("Mari"));
        System.out.println("Original TreeSet"+treeSet);
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println("Treeset after poll first and last: "+treeSet);
        treeSet.remove("Nepal");
        System.out.println("Treeset after remove nepal: "+treeSet);
        System.out.println(treeSet.descendingSet());
    }
}

enum EnumSets {
    Starwin, Mari, Blesson, ThangaDhinesh
}