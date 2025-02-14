package test1.basic3OMC;

class Singleton{

    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton Instance created");

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance =new Singleton();
        }
        return instance;
    }

}
public class Example {

    int X;
    int Y;

    Example() {
        X = 5;
    }

    Example(int value) {
        this.Y = value; // ✅ Ensuring Y is correctly assigned
        System.out.println(Y); // This prints the value during object creation
    }


    public static void main(String[] args) {

//        Example e1 = new Example();
//        Example e2 = new Example(10);

        //variables declared inside a class (instance variables) belong to specific objects
        // (instances) of that class
        //to acces the x and y so use static variable then instance variables
//        System.out.println("first example "+ e1.X);
//        System.out.println("second example "+e2.Y);



        Example e1 = new Example();   // Calls default constructor
        Example e2 = new Example(10); // Calls parameterized constructor

        System.out.println("first example X: " + e1.X); // Prints 5
        System.out.println("second example Y: " + e2.Y);// ✅ Prints 10 (Correctly stored)


        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2);

    }
}
