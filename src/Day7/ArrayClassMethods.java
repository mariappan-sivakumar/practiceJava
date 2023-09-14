package Day7;

import java.util.Arrays;
import java.util.List;

public class ArrayClassMethods {
    public static void main(String[] args) {
        Integer[] intArr={20,30,10,40,50,15};
//        Converting Integer array into Integer List with the help of Arrays.asList method
        List<Integer> integerList= Arrays.asList(intArr);
        System.out.println(integerList);
//        To sort the given array use Arrays.sort method
        Arrays.sort(intArr);
        for (Integer i:
             intArr) {
            System.out.printf("%d ",i);
        }
        System.out.println();
// Print the number and corresponding index using binary Search for binary search we must have to sort the array
        System.out.println(20 + " found at index = "+ Arrays.binarySearch(intArr, 20));
// Print the number and the corresponding index using binary search in a range  java
        System.out.println(20 + " found at index = " + Arrays.binarySearch(intArr, 1, 6, 20));
        int[] intArr1={ 10, 20, 15, 22, 35 };
// Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
        int[] intArr2=Arrays.copyOf(intArr1, 10);
// toString is used to print the value of the array in a single line without loop.
        System.out.println(Arrays.toString(intArr2));
// Copies the specified range of the specified array into a new Arrays.
        System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
// Returns true if the two specified arrays are deeply equal to one another.
        int[][] intArr3 = { { 10, 20, 15, 22, 35 } };
        int[][] intArr4 = { { 10, 15, 22 } };
        int[][] intArr5 = { { 10, 20, 15, 22, 35 } };
        // To compare both arrays
        System.out.println("Integer Arrays on deepEquals comparison 2d: "+  Arrays.deepEquals(intArr3, intArr4));
        System.out.println("Integer Arrays on deepEquals comparison 2d: "+  Arrays.deepEquals(intArr3, intArr5));
        // To compare both arrays
        System.out.println("Integer Arrays on comparison 1D: "
                + Arrays.equals(intArr2, intArr1));
//  Returns a hash code based on the “deep contents” of the specified Arrays.
        System.out.println("Integer Array Deep Hashcode 2D: " + Arrays.deepHashCode(intArr3));
        System.out.println("Integer Array Normal Hashcode 2D: "+ Arrays.hashCode(intArr3)); //To get hashcode for 2d array use deephashcode
// Returns an integer hashCode of this array instance.
        System.out.println("Integer Array Normal Hashcode 1D: " + Arrays.hashCode(intArr));
//  Returns a string representation of the “deep contents” of the specified Arrays.
        System.out.println("Integer Array Deep String: " + Arrays.deepToString(intArr3));
        System.out.println("Integer Array With normal to string: "+ Arrays.toString(intArr3));
//Assigns this fill value to each index of these arrays.
        Arrays.fill(intArr2, 20);
        System.out.println("Integer Array on filling: " + Arrays.toString(intArr2));
//Finds and returns the index of the first unmatched element between the two specified arrays.
        int[] intArr6= { 10, 15, 22,1,2,4,3 };
// Performs parallelPrefix for complete array with the specified functional operator.
//        Arrays.parallelSort(intArr6);
//        Arrays.sort(intArr6);
        Arrays.sort(intArr6,1,4); //last to index is exclusive.
        System.out.println(Arrays.toString(intArr6));
        System.out.println("Integer Array: "+ Arrays.spliterator(intArr1));

    }
}
