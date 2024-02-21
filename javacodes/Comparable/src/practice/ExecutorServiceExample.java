package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Creating an ExecutorService with a fixed pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new count());
        executorService.submit(new count());

        // Shutting down the ExecutorService
        executorService.shutdown();
    }
}

class count implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Task: " + i);
        }
    }
}