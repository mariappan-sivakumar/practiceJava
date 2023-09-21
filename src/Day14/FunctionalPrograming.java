package Day14;

import java.util.Arrays;
import java.util.List;

public class FunctionalPrograming {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printWithFunctionalProgramming(numbers);
//        printEvenWithFunctionalProgramming(numbers);
//        printOddWithFunctionalProgramming(numbers);
//        numbers.stream().filter(i->i%2!=0).forEach(System.out::println);
        List<String> courses =Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
//        printCourseWithSpring(courses);
//        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
//        printCourseWithLengthAtLeast4(courses);
//        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
//        numbers.stream().filter(number->number%2==0).map(number->number*number).forEach(System.out::println);
//        printSquareOfEvenNumber(numbers);
//        printCubeOfOddNumber(numbers);
//        numbers.stream().filter(number->number%2!=0).map(number->(int)Math.pow(number,3)).forEach(System.out::println);

        courses.forEach(course-> System.out.println(course.length()));//without stream
        courses.stream().map(course->course.length()).forEach(System.out::println);

    }
    public static void print(int number){
        System.out.println(number);
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void printWithFunctionalProgramming(List<Integer> numbers){
        numbers.forEach(FunctionalPrograming::print);//method Reference
        numbers.forEach(i-> print(i));//lambda
        numbers.forEach(System.out::println);//simplest way
    }
    public static void printEvenWithFunctionalProgramming(List<Integer> numbers){
        numbers.stream()//create a stream for the list
                .filter(FunctionalPrograming::isEven)//filter the even number with method reference
                .forEach(FunctionalPrograming::print);//method Reference the print statement
        numbers.stream().filter(i->i%2==0).forEach(i-> print(i));//using lambda expression
        numbers.stream().filter(i->i%2==0).forEach(System.out::println);//simplest way
    }
//    public static void printOddWithFunctionalProgramming(List<Integer> numbers){
//        numbers.stream().filter(i->i%2!=0).forEach(System.out::println);//simplest way
//
//    }
//    public static void printCourseWithSpring(List<String> courses){
//        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
//    }
//    public static void printCourseWithLengthAtLeast4(List<String> courses){
//        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
//    }
//    public static void printSquareOfEvenNumber(List<Integer> numbers){
//        numbers.stream().filter(number->number%2==0).map(number->number*number).forEach(System.out::println);
//    }
//    public static void printCubeOfOddNumber(List<Integer> numbers){
//        numbers.stream().filter(number->number%2!=0).map(number->(int)Math.pow(number,3)).forEach(System.out::println);
//    }
//    public static void printSizeOfCourse(List<String> courses){
//        courses.forEach(course-> System.out.println(course.length()));
//    }
}
