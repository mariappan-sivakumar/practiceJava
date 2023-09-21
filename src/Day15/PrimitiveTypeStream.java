package Day15;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveTypeStream {
    public static void main(String[] args) {
        System.out.println((Stream.of(12,34,56,7,88,98,76,5,4,33,21,10).count()));
        int[] arrayList={12,34,56,7,88,98,76,5,4,33,21,10};
        System.out.println(Arrays.stream(arrayList).sum());
        System.out.println(IntStream.range(1,10).sum());
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        System.out.println(IntStream.iterate(1,e->e+2).limit(10).sum());
        System.out.println(IntStream.iterate(1,e->e+2).limit(10).peek(System.out::println).sum());
        System.out.println(IntStream.iterate(2,e->e+2).limit(10).peek(System.out::println).sum());
        System.out.println(IntStream.iterate(1,e->e*2).limit(10).peek(System.out::println).sum());
        System.out.println(IntStream.iterate(1,e->e+2).limit(10).boxed().collect(Collectors.toList()));
        System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));
    }
}
