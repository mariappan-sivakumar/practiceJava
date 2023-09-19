package Day13;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class InventoryDataBase {
    private static final int HIGHEST_PRICE=1000;
    private TreeMap<Integer,Integer> priceToCountMap=new TreeMap<>();
    private ReentrantLock lock=new ReentrantLock();
    private ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private Lock readLock=readWriteLock.readLock();
    private Lock writeLock=readWriteLock.writeLock();
    public static void main(String[] args) throws InterruptedException {
        InventoryDataBase inventoryDataBase=new InventoryDataBase();
        Random random=new Random();
        for (int i = 0; i < 100000; i++) {
            inventoryDataBase.addItem(random.nextInt(HIGHEST_PRICE));
        }
        Thread writer=new Thread(()->{
            while (true){
                inventoryDataBase.addItem(random.nextInt(HIGHEST_PRICE));
                inventoryDataBase.removeItem(random.nextInt(HIGHEST_PRICE));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }

            }
        });
        writer.setDaemon(true);
        writer.start();
        int numberOfReaderThread=7;
        List<Thread> readers=new ArrayList<>();
        for (int readerThread = 0; readerThread < numberOfReaderThread; readerThread++) {
            Thread reader=new Thread(()->{
                for (int i = 0; i < 100000; i++) {
                    int upperBound=random.nextInt(HIGHEST_PRICE);
                    int lowerBound=upperBound>0? random.nextInt(upperBound) : 0;
                    inventoryDataBase.getNumberOfItemsInPriceRange(lowerBound,upperBound);
                } 
            });
            reader.setDaemon(true);
            readers.add(reader);
        }

        long startTime=System.currentTimeMillis();
        for(Thread thread: readers){
            thread.start();
        }
        for(Thread thread: readers){
            thread.join();
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("Total time required: %d",endTime-startTime);
    }

    public int getNumberOfItemsInPriceRange(int lowerBound,int upperBound) {
        readLock.lock();
        try {
            int sum = 0;
            Integer fromKey = priceToCountMap.ceilingKey(lowerBound);
            Integer toKey = priceToCountMap.floorKey(upperBound);
            if (fromKey == null || toKey == null) {
                return 0;
            }
            if (toKey > fromKey){
            NavigableMap<Integer, Integer> rangeOfPrice = priceToCountMap.subMap(fromKey, true, toKey, true);

            for (int numberOfItemsForPrice :
                    rangeOfPrice.values()) {
                sum += numberOfItemsForPrice;
            }}
            return sum;
        }finally {
            readLock.unlock();
        }
    }
    public void addItem(int price){
        writeLock.lock();
        try {
            Integer numberOfItemsForPrice=priceToCountMap.get(price);
            if (numberOfItemsForPrice==null){
                priceToCountMap.put(price,1);
            }
            else {
                priceToCountMap.put(price,numberOfItemsForPrice);
            }
        }finally {
            writeLock.unlock();
        }

    }
    public void removeItem(int price){
        writeLock.lock();
        try{
            Integer numberOfItemsForPrice=priceToCountMap.get(price);
            if (numberOfItemsForPrice==null||numberOfItemsForPrice==1){
                priceToCountMap.remove(price);
            }
            else {
                priceToCountMap.put(price,numberOfItemsForPrice-1);
            }
        }finally {
            writeLock.unlock();
        }

    }
}
