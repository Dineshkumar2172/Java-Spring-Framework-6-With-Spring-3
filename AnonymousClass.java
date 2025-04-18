class SomethingNormal {
    public void print() {
        System.out.println("normal something");
    }
}


public class AnonymousClass {
    public static void main(String[] args) {
        SomethingNormal somethingNormal = new SomethingNormal();
        somethingNormal.print();

        SomethingNormal somethingNormal2 = new SomethingNormal() {
                // overrided print method from main class using anonymous class
                public void print() {
                    System.out.println("something anonymous");
                }
        };

         somethingNormal2.print();
    }
}