package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoliceHacker {
    public static final int MAX_PASSWORD=9999;
    public static void main(String[] args) {
        Random random=new Random();
        Vault vault=new Vault(random.nextInt(MAX_PASSWORD));
        List<Thread> threads=new ArrayList<>();
        threads.add(new AscendingHackerThread(vault));
        threads.add(new DecendingHackerThread(vault));
        threads.add(new PoliceThread());
        for(Thread thread: threads){
            thread.start();
        }
    }

    // Vault have 2method one is constructor to store the password for the vault and other is to find the given password is correct or not
    private static class Vault{
        private int password;
        public Vault(int password){
            this.password=password;
        }
        public boolean isCorrectPassword(int password){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
            return this.password==password;
        }
    }   

    /**
     * HackerThread is the abstract class it contains private variable vault to get the vault object and constructor to get vault object and set name and priority of the thread
     * and I override the start method of thread and add a print statement to it to check which subclass is running
     */

    private static abstract class HackerThread extends Thread{
        protected Vault vault;
        public HackerThread(Vault vault){
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public synchronized void start() {
            System.out.println("Starting Thread: "+ this.getName());
            super.start();
        }
    }

// Ascending Hacker thread extends hacker thread, and it has the run method to find the password using for loop in ascending order. if the hacker find the password it will end the program
    private static class AscendingHackerThread extends HackerThread{

        public AscendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int i = 0; i < MAX_PASSWORD; i++) {
                if(vault.isCorrectPassword(i)){
                    System.out.println(this.getName()+" find the password: "+ i);
                    System.exit(0);
                }
            }
        }
    }
    // Ascending Hacker thread extends hacker thread, and it has the run method to find the password using for loop in Descending order. if the hacker find the password it will end the program
    private static class DecendingHackerThread extends HackerThread{

        public DecendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int i = MAX_PASSWORD; i >= 0; i--) {
                if (vault.isCorrectPassword(i)){
                    System.out.println(this.getName()+" found the password: "+i);
                    System.exit(0);
                }

            }
        }
    }

    // Police thread extends thread and have the run method of counting from 10 to 1 and if the hacker didn't find the password with in 10sec police will stop the program
    private static class PoliceThread extends Thread{
        @Override
        public void run() {
            for (int i = 10; i >0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println(i );
            }
            System.out.println("Game over for you Hacker");
            System.exit(0);

        }
    }
}
