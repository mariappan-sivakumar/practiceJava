package Day14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        Function<Integer, Integer> mapper = x -> x * x;
        BinaryOperator<Integer> addBinaryOperator = (x, y) -> x + y;
        UnaryOperator<Integer> unaryOperator=(x)->x*3;
        Supplier<Integer> randomNumber=()->{
            Random random=new Random();
            return random.nextInt(1000);
//            return 2;
        };
        BiPredicate<Integer,String > biPredicate=(number,str)-> number>10&&str.length()>5;
        BiFunction<Integer, String,String > biFunction = (number, str) -> number + str;
        BiConsumer<Integer,String > biConsumer=(number,str)->{
            System.out.println(number);
            System.out.println(str);
        };


        printOddAndEven(numbers, x -> x % 2 == 0);
        printOddAndEven(numbers, oddPredicate);
        printOddAndEven(numbers, x -> x % 3 == 0);
        List<Integer> squareNumber = changeList(numbers, mapper);
        System.out.println(squareNumber);
        System.out.println(changeList(numbers, x -> x * 2));
        int sum1 = reduceList(numbers, addBinaryOperator, 0);
        System.out.println(sum1);
        System.out.println(reduceList(numbers, (x, y) -> x - y, 0));
        System.out.println(reduceList(numbers, (x, y) -> x * y, 1));
        System.out.println(randomNumber.get());
        System.out.println(unaryOperator.apply(5));
        System.out.println(biPredicate.test(15,"Testing the bi-predicate"));
        System.out.println(biFunction.apply(5,"Mari"));
        biConsumer.accept(5,"String ");

    }

    private static Integer reduceList(List<Integer> numbers, BinaryOperator<Integer> addBinaryOperator, int identity) {
        return numbers.stream().reduce(identity, addBinaryOperator);
    }

    private static List<Integer> changeList(List<Integer> numbers, Function<Integer, Integer> mapper) {
        return numbers.stream().map(mapper).collect(Collectors.toList());
    }

    private static void printOddAndEven(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
}
