package Test.EY.EYTest;

import java.util.concurrent.BlockingQueue;

public class EYTestBlockingQueue {

	    private final int capacity;
	    private final Object[] queue;
	    private int size;
	    private int head;
	    private int tail;

	    public EYTestBlockingQueue(int capacity) {
	        this.capacity = capacity;
	        this.queue = new Object[capacity];
	        this.size = 0;
	        this.head = 0;
	        this.tail = 0;
	    }

	    //using put method for adding items to the queue
	    //If the queue is already at maximum capacity, it waits until there is space available in the queue.
	    
	    public synchronized void put(Object item) throws InterruptedException {
	        while (size >= capacity) {
	            wait();
	        }
	        queue[tail] = item;
	        tail = (tail + 1) % capacity;
	        size++;
	        notifyAll();
	    }
	    
	    //using get method for retrieving items from the queue

	    // If the queue is empty, it waits until there are items available.
	    
	    public synchronized Object get() throws InterruptedException {
	        while (size == 0) {
	            wait();
	        }
	        Object item = queue[head];
	        head = (head + 1) % capacity;
	        size--;
	        notifyAll();
	        return item;
	    }
	}

   //it will produce the items
	class Producer implements Runnable {
	    private final EYTestBlockingQueue queue;

	    public Producer(EYTestBlockingQueue queue) {
	        this.queue = queue;
	    }

	    @Override
	    public void run() {
	        try {
	            for (int i = 0; i < 20; i++) {
	                queue.put(i);
	                System.out.println("Produced: " + i);
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	//it will consumes the item
	class Consumer implements Runnable {
	    private final EYTestBlockingQueue queue;
	    private final int consumerId;

	    public Consumer(EYTestBlockingQueue queue, int consumerId) {
	        this.queue = queue;
	        this.consumerId = consumerId;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                Object item = queue.get();
	                System.out.println("Consumer " + consumerId + " consumed: " + item);
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	

	    public static void main(String[] args) {
	    	
	    	//create one producer thread and five consumer threads.
	    	//The producer produces 20 items.
	    	
	    	EYTestBlockingQueue queue = new EYTestBlockingQueue(5);
	        Thread producerThread = new Thread(new Producer(queue));
	        Thread[] consumerThreads = new Thread[5];
	        for (int i = 0; i < 5; i++) {
	            consumerThreads[i] = new Thread(new Consumer(queue, i));
	        }

	        producerThread.start();
	        for (Thread consumerThread : consumerThreads) {
	            consumerThread.start();
	        }

	        try {
	            producerThread.join();
	            for (Thread consumerThread : consumerThreads) {
	                consumerThread.join();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



