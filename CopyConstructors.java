package DSA.OOPs;

public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Chetan";
        s1.age = 22;
        s1.password = 2345643;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.marks[1] = 100;    //changing the marks after s2 is copied
        s2.name = "Manju";
        s2.password = 3423451;
        System.out.println(s2.name + " " + s2.age + " " + s2.password);
        for (int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

        System.out.println(s1.name + " " + s1.age + " " + s1.password);
        for (int i=0; i<3; i++){
            System.out.println(s1.marks[i]);
        }
    }
}

class Student{
    String name;
    int age;
    int password;
    int marks[];

    Student(){
        this.marks = new int[3];   //You should initialize the object's marks field
        System.out.println("The Student Cosntrutor is called");
    }

    // Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    //Deep Copy Constructors
    Student(Student s1){
        marks = new int[3];
        this.age = s1.age;
        for (int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
