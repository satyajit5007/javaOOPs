package test1;

class Pen{
    String color;
    String type;
     public void write(){
         System.out.println("Writing things type-> " + color +" "+ type);
     }
}


class Student{
    String name;
    int age;

    public void nameinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class basic1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color="blue";
        p1.type= "ball pen";
        p1.write();

        Pen p2 = new Pen();
        p2.color="black";
        p2.type="Gel pen";
        p2.write();


        System.out.println("----------------------------------");

        Student s1 = new Student();
        s1.name = "Satyajit";
        s1.age= 24;
        s1.nameinfo();
    }
}
