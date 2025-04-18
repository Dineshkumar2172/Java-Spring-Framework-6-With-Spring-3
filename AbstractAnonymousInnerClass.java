abstract class AbstractClassExample {
    public abstract void abstractMethod();
}

// we know we cannot create object for the above abstract class directly
// but with the help of anonymous inner class we can make perform implementation
// on the runtime and make an object out of it and make use of it.

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        AbstractClassExample abstractClass = new AbstractClassExample() {
            public void abstractMethod() {
                System.out.println("defined abstract method inside anonymous class");
            }
        };

        abstractClass.abstractMethod();
    }
}
