package abstraction.execution;

public class MyThread2 {

    public static final Runnable RUNNABLE = () -> {
        System.out.println("Thread 2 Created!");
    };

    public static final Thread thread = new Thread(RUNNABLE);
}