package test1;

import javax.lang.model.element.NestingKind;

public class basic1Var {
    //variable type in java it
    // instance variables ,
    // static variables,
    // local variables ,
    // final variable



    // instance variable

    int age;  // instance
    String surname;

    int number = 100;  //  instance and initialization in it
    String Name ="Satyajit";

    //Static variable

    static String a;
    static int b;


    //local variables ->Declared inside a method, constructor, or block.

    public void showdata(){
        int c = 10;
        System.out.println(c);
    }


    public static void main(String[] args) {

        basic1Var b1 = new basic1Var();
        b1.showdata();

    }
}
