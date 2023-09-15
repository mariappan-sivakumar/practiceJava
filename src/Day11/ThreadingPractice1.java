package Day11;

import java.math.BigInteger;

public class ThreadingPractice1 {

    public static void main(String[] args) {
        Thread thread=new Thread(new BlockingTask());

        thread.start();
        thread.interrupt();
        Thread thread1=new Thread(new LongCompute(new BigInteger("10000"),new BigInteger("1500000000")));
        thread1.setDaemon(true);
        thread1.start();
        thread1.interrupt();
    }
    private static class LongCompute implements Runnable{

        private BigInteger base;
        private BigInteger power;

        public LongCompute(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base+"^"+power+"="+pow(base,power));
        }
        private BigInteger pow(BigInteger base,BigInteger power){
            BigInteger result=BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power)!=0; i=i.add(BigInteger.ONE)) {
//                if(Thread.currentThread().isInterrupted()){
//                    System.out.println("Interupted outside");
//                    return BigInteger.ZERO;
//                }
                result=result.multiply(base);
            }
            return result;
        }
    }
    private static class BlockingTask implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
}
