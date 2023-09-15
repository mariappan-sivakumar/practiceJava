package Day11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorial {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers= Arrays.asList(0L, 324L,65345L,6562L,23L,5556L);
        List<FactorialThread> factorialThreads=new ArrayList<>();
        for (long inputNumber :
                inputNumbers) {
            factorialThreads.add(new FactorialThread(inputNumber));
        }
        for (Thread thread :
                factorialThreads) {
            thread.setDaemon(true);
            thread.start();
        }
        for (Thread thread: factorialThreads){
            thread.join(1000);
        }
        for (int i = 0; i < factorialThreads.size(); i++) {
            FactorialThread factorialThread= factorialThreads.get(i);
            if(factorialThread.isComplete()){
                System.out.println("Factorial of "+inputNumbers.get(i)+" is "+'\n'+factorialThread.getResult());

            }
            else {
                System.out.println("Calculation for "+inputNumbers.get(i)+" is still progress!");
            }
        }
    }
    public static class FactorialThread extends Thread{
        private long inputNumber;
        private BigInteger result=BigInteger.ZERO;
        private boolean isComplete=false;

        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
        }

        @Override
        public void run() {
            this.result=factorial(inputNumber);
            this.isComplete=true;
        }
        public BigInteger factorial(long n){
            BigInteger tempResult=BigInteger.ONE;
            for (long i = n; i >0; i--) {
                tempResult=tempResult.multiply(new BigInteger(Long.toString(n)));
            }
            return tempResult;
        }
        public boolean isComplete(){
            return isComplete;
        }
        public BigInteger getResult(){
            return result;
        }
    }
}

