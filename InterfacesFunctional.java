@FunctionalInterface // means an interface with only one method
interface InterfaceClass {
    void print();
}

@FunctionalInterface
interface InterfaceClass2 {
    void print(int n); // functional interface method which takes an input
}

@FunctionalInterface
interface InterfaceClassWithReturnType {
    int sum(int i, int j);
}

class ConcreteFunctionalInterface implements InterfaceClass {
    public void print() {
        System.out.println("defined print function inside concrete class");
    }
}

public class InterfacesFunctional {
    public static void main(String[] args) {
        InterfaceClass concreteFunctionalInterface = new ConcreteFunctionalInterface();
        concreteFunctionalInterface.print();

        // we can also make use of anonymous inner class
        InterfaceClass interfaceClass = new InterfaceClass() {
            @Override
            public void print() {
                System.out.println("defined print function inside anonymous class");
            }
        };

        interfaceClass.print();

        // we can use lambda expressions - can only be used with functional interface
        // because for functional interface, compiler knows which method were are trying to implement
        // since there's only one method declared in functional interfaces.
        InterfaceClass interfaceClass2 = () -> {
                System.out.println("defined print function inside lambda expression");
        };

        interfaceClass2.print();

        // we can reduce the lines even further using lambda expression since we have only one line defined for interface method
        InterfaceClass interfaceClass3 = () -> System.out.println("defined print function using lambda expression - single line");
        interfaceClass3.print();

        InterfaceClass2 interfaceClass22 = (int i) -> System.out.println("defined parameterised print function using lambda expression - single line" + i);
        interfaceClass22.print(22);

        // since we provided the type of argumeter this function accepts, we can even remove the data type in argyment of lambda expression
        interfaceClass22 = (i) -> System.out.println("defined parameterised print function using lambda expression with removed data type - single line" + i);
        interfaceClass22.print(23);

        // since we have only one parameter, we don't even need () in expression, we can pass our parameter right away
        interfaceClass22 = i -> System.out.println("defined parameterised print function using lambda expression with removed data type and braces - single line" + i);
        interfaceClass22.print(23);


        // Lambda expression with return
        InterfaceClassWithReturnType interfaceClassWithReturnType = (i, j) -> {return i + j;};
        int result = interfaceClassWithReturnType.sum(1, 2);
        System.out.println("parameterised functional interface with return statement : " + result);
        
        // we can reduce even more characters with the help of lambda expresison for method with return type
        interfaceClassWithReturnType = (i, j) -> i + j;
    }
}
