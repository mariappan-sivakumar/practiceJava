package Day13;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOBoundApplication {
    //    private static final int NUMBER_OF_TASKS=100000;
    private static final int NUMBER_OF_TASKS = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to Start");
        scanner.nextLine();
        System.out.printf("Number of task going to run %d%n", NUMBER_OF_TASKS);
        long start = System.currentTimeMillis();
        performTask();
        long end = System.currentTimeMillis();
        System.out.printf("Time required to complete the task is %d%n", end - start);
    }

    private static void performTask() {
        try {
//            ExecutorService executorService = Executors.newCachedThreadPool();
            ExecutorService executorService = Executors.newFixedThreadPool(1000);
            for (int i = 0; i < NUMBER_OF_TASKS; i++) {
//                executorService.submit(() -> blockingIOOperation());
                executorService.submit(() -> {
                    for (int j = 0; j < 100; j++) {
                        blockingIOOperation();
                    }
                });
            }
        } finally {

        }
    }

    private static void blockingIOOperation() {
        System.out.println("Executing a blocking task from thread" + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
