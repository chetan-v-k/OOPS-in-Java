

public class Constructors {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        Student s1 = new Student("Chetan", 22);
        System.out.println(s1.name);
        System.out.println(22);
    }
}

//verifying the that constructors is called 
class Pen{
    String Color;
    int tip;

    Pen(){
        System.out.println("The Pen constructor is called ");
    }
}
class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}


