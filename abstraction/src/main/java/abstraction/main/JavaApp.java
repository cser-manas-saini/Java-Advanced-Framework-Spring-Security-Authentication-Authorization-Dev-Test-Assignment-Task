package abstraction.main;
import java.util.function.Consumer;
import java.util.function.Predicate;

import abstraction.execution.MyThread1;
import abstraction.execution.MyThread2;

public class JavaApp {

    public static void execution() {
      Predicate<Integer> isEvenPositive =(n) -> ((n>0)&& (n%2 ==0));
      System.out.println(isEvenPositive.test(12));
    }
}