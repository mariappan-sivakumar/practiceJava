package Day7;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//    Indirect Method of Declaration:
        int[][] arr = new int[4][4];
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//      Direct Declaration
        int[][] arrDirect = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrDirect[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 4, 5, 6 }, { 1, 3, 2 } };
        int[][] sum = new int[2][3];

        // adding two 2D arrays element-wise
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Resultant 2D array: ");
//        for (int i = 0; i < sum.length; i++) {
//            System.out.println(Arrays.toString(sum[i]));
//        }
        System.out.println(Arrays.deepToString(sum));
        final int[] numbers = { 1, 2, 3, 4, 5 };
        numbers[0] = 10;
        System.out.println(Arrays.toString(numbers));
//        numbers={ 1, 2, 3}; // It is not allowed because the final hold the variable not to change its value but inside the number we can change the element of the array

    }
}
