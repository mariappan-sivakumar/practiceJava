package Day15;

import java.util.stream.LongStream;

public class ParallelizationFunctional {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
//        System.out.println(LongStream.range(0,1000000000).sum());
        System.out.println(LongStream.range(0,1000000000).parallel().sum());
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
