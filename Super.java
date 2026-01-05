package DSA.OOPs;

public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.Color);
    }
}

class Animal{
    String Color;
    Animal(){
        System.out.println("Animal constructor is called"); 
    }
}

class Horse extends Animal{

    Horse(){
        //super(); //this calls the immediate parent class Constructor
        super.Color = "brown";  //like this super keyword is used to access the properties of parent clas
        System.out.println("Horse constructor is called");
    }
}
