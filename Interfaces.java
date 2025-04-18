interface A {
    
    // variabled defined inside inteface are final and static
    int age = 40;
    String area = "something";

    void print();
    void show();
}

// concrete class implementing interface A
class InterfaceImplementation implements A {
    public void print() {
        System.out.println("printing concrete implementation");
    }

    public void show() {
        System.out.println("showing concrete implementation");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // creating object and making use of interface methods defined in concrete class
        A interfaceImplementation = new InterfaceImplementation();
        interfaceImplementation.print();
        interfaceImplementation.show();

        System.out.println(A.age);
        System.out.println(A.area);

        // implementing and defining interface by making using of anonynous inner class.
        A a = new A() {
            @Override
            public void print() {
                System.out.println("printing: implemented and defined using anonymous class");
            }
            
            @Override
            public void show() {
                System.out.println("showing: implemented and defined using anonymous class");
            }
        };

        a.print();
        a.show();
    }
}
