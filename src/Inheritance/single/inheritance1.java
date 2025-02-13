package Inheritance.single;

public class inheritance1 {

    public static void main(String[] args) {
        System.out.println("hello");
        A a = new A();
        a.msg();
        System.out.println(a.x);

        B b = new B();
        System.out.println(b.y);
        b.hello();

        int c = a.x + b.y;
        System.out.println(c);



    }
}