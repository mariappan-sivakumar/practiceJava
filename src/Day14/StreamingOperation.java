package Day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamingOperation {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        int sum = sumListOfNumber(numbers);
        System.out.println(sum);
//        sum of squares in a list
        System.out.println(numbers.stream().map(number -> number * number).reduce(0, Integer::sum));
        System.out.println(numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum));
        System.out.println(numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number).reduce(0, Integer::sum));
        System.out.println();
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();
        numbers.stream().distinct().sorted().forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println();
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();
        courses.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
        System.out.println();
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        List<Integer> integerList = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(integerList);
        List<Integer> evenNumberList = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        List<Integer> lengthOfCourseName = courses.stream().map(String::length).collect(Collectors.toList());
        System.out.printf("%s%n%s%n", evenNumberList, lengthOfCourseName);
    }

//    private static int sum(int a, int b){
////        System.out.printf("a %d b %d%n",a,b);
//        return a+b;
//    }

    private static int sumListOfNumber(List<Integer> numbers) {
//        return numbers.stream().reduce(0,(a,b)->a+b);
//        the flow happen with the help of reduce and a,b parameter pass into lambda expression
//        a 0 b 12
//        a 12 b 9
//        a 21 b 13
//        a 34 b 4
//        a 38 b 6
//        a 44 b 2
//        a 46 b 4
//        a 50 b 12
//        a 62 b 15
        return numbers.stream().reduce(0, Integer::sum);
    }

}
