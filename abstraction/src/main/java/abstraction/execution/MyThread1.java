package abstraction.execution;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread 1 Created!");
    }
}