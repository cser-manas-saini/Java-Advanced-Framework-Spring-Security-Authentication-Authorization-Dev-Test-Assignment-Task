package abstraction.execution;

public class Concrete {

    public static Interface INTERFACE = () -> {
        System.out.println("incompleteMethod() of class Concrete");
    };

    public static Operation OPERATION = (a, b) -> {
        System.out.println(a + b);
    };

    public static Maths MATHS = (a, b) -> {
        return "addition is " + (a + b);
    };
}