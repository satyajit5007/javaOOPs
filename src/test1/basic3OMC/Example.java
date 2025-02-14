package test1.basic3OMC;

public class Example {

    int X;

    int Y;
    Example (){
        X= 5;
    }

    Example (int value){
        Y = value;
    }


    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(10);

        //variables declared inside a class (instance variables) belong to specific objects
        // (instances) of that class
        //to acces the x and y so use static variable then instance variables
        System.out.println("first example "+ e1.X);
        System.out.println("second example "+e2.Y);
    }
}
