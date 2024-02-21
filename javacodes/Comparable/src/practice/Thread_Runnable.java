package practice;

class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

public class Thread_Runnable  {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable()); // Creating a thread with a Runnable object
        thread.start(); // Starting the thread
    }
}
