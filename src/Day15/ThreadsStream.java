package Day15;

import java.util.stream.IntStream;

public class ThreadsStream {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(Thread.currentThread().getId()+": "+i);
                }
            }
        };
        Runnable runnable1=()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getId()+": "+i);
            }
        };
        Runnable runnable2=()->{
            IntStream.range(1,10000).forEach(i-> System.out.println(Thread.currentThread().getId()+": "+i));
        };

        Thread thread=new Thread(runnable2);
        Thread thread1=new Thread(runnable2);
        Thread thread2=new Thread(runnable2);
        long start=System.currentTimeMillis();
        thread.start();
        thread1.start();
        thread2.start();
        thread.join();
        thread1.join();
        thread2.join();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
