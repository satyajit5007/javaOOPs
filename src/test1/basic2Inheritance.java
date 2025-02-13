package test1;

class shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends shape{
    public void area(int l , int h){
        //integer division (1/2 = 0). issue
        System.out.println(1.0/2*l*h);
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class basic2Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(1,5);

        circle c1 = new circle();
        c1.area(4);
    }
}
