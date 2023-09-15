package Day11;

public class ThreadingPractice {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("You are inside the thread");
                System.out.println("Thread name is "+Thread.currentThread().getName());
                System.out.println("Thread Priority is "+Thread.currentThread().getPriority());
                throw new RuntimeException("Intentional Error");
            }
        });
        thread.setName("First Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(e.getMessage()+ " is happened in "+t.getName());
            }
        });
        System.out.println("You are now just before the start of First Thread your current Thread is "+Thread.currentThread().getName());
        thread.start();
        System.out.println("You are now just after the start of the First Thread your current thread is "+Thread.currentThread().getName());
    }
}
