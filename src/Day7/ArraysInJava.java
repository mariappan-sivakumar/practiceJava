package Day7;

public class ArraysInJava {
    public static void main(String[] args) {
        oneDimensionalArray();
        System.out.println();
        ArraysInJava arraysInJava = new ArraysInJava();
        arraysInJava.studentArray();
        System.out.println();
        multiDimensionalArray();
        System.out.println();
        int[] arr = {3, 1, 2, 5, 4};
        // passing array to method m1
        sum(arr);
        System.out.println();
        int[] returnedArray = returnArray();
        for (int i = 0; i < returnedArray.length; i++) {
            System.out.print(returnedArray[i] + " ");
        }
        System.out.println();
        objectClass();
        System.out.println();
        cloneArray();
        System.out.println();
        dimensionalArray();
        System.out.println();
        defaultValueInArray();
    }

    //    To create and use One Dimensional Array
    public static void oneDimensionalArray() {
        // declares an Array of integers.
        int[] oneDimension;

        // allocating memory for 5 integers.
        oneDimension = new int[5];

        // initialize the elements of the array
        oneDimension[0] = 10;
        oneDimension[1] = 20;
        oneDimension[2] = 30;
        oneDimension[3] = 40;
        oneDimension[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < oneDimension.length; i++)
            System.out.println("Element at index " + i
                    + " : " + oneDimension[i]);
    }

    public void studentArray() {
        // declares an Array of integers.
        Student1[] students;

        // allocating memory for 5 objects of type Student.
        students = new Student1[5];

        // initialize the elements of the array
        students[0] = new Student1(1, "aman");
        students[1] = new Student1(2, "vaibhav");
        students[2] = new Student1(3, "shikar");
        students[3] = new Student1(4, "dharmesh");
        students[4] = new Student1(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < students.length; i++) {
            System.out.println("Element at " + i + " : "
                    + students[i].roll_no + " "
                    + students[i].name);
        }
        // accessing the elements of the specified array
        for (Student1 m : students) {
            System.out.println(m);
        }
    }

    public static void multiDimensionalArray() {
        // declaring and initializing 2D array
        int[][] multiDimensional
                = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiDimensional[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sum(int[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }

    public static int[] returnArray() {
        // returning  array
        return new int[]{1, 2, 3};
    }

    public static void objectClass() {
        int[] intArray = new int[3];
        byte[] byteArray = new byte[3];
        short[] shortsArray = new short[3];

        // array of Strings
        String[] strArray = new String[3];

        System.out.println(intArray.getClass()); //The string “[I” is the run-time type signature for the class object “array with component type int.”
        System.out.println(intArray.getClass().getSuperclass()); //The only direct superclass of an array type is java.lang.Object.
        System.out.println(byteArray.getClass());//The string “[B” is the run-time type signature for the class object “array with component type byte.”
        System.out.println(shortsArray.getClass());//The string “[S” is the run-time type signature for the class object “array with component type short.”
        System.out.println(strArray.getClass());//The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.
    }

    public static void cloneArray() {
//When you clone a single-dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references.
        int[] intArray = {1, 2, 3};

        int[] cloneArray = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }

    public static void dimensionalArray() {
//A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it creates only a single new array with each element array a reference to an original element array, but subarrays are shared.
        int[][] intArray = {{1, 2, 3}, {4, 5}};

        int[][] cloneArray = intArray.clone();

        // will print false
        System.out.println(intArray == cloneArray);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }

    public static void defaultValueInArray() {
        System.out.println("String array default values:");
        String[] str = new String[5];
        for (String s : str)
            System.out.print(s + " ");

        System.out.println(
                "\n\nInteger array default values:");
        int[] num = new int[5];
        for (int val : num)
            System.out.print(val + " ");

        System.out.println(
                "\n\nDouble array default values:");
        double[] dnum = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println(
                "\n\nBoolean array default values:");
        boolean[] bnum = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        System.out.println(
                "\n\nReference Array default values:");
        ArraysInJava[] demo = new ArraysInJava[5];
        for (ArraysInJava val : demo)
            System.out.print(val + " ");
    }
}

// This class is used to learn how to create a array of User defined datatype or class
class Student1 {
    public int roll_no;
    public String name;

    Student1(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "roll_no=" + roll_no +
                ", name='" + name + '\'';
    }
}

