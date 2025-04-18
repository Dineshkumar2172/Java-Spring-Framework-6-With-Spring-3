abstract class Something {
    // abstract method can able be declared inside abstract class.
    // abtract class can or cannot have abstract method in it. (one way dependancy)
    public abstract void sample(); // abstract method cannot be defined
    public void example() { // defined method cannot be abstract
        System.out.println("something");
    };
}

class ExtendedSomething extends Something {
    // cannot create an object for abstract class
    // can only create an object for concrete classes that implements abstract class
    public void sample() {
        System.out.println("defined abstract method");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        ExtendedSomething es = new ExtendedSomething();
        es.sample();
    }
}
