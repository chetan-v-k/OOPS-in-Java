package DSA.OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        // System.out.println(h1.Color);
        h1.walk();
        h1.changeColor();
        System.out.println(h1.Color);
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
    }
}
abstract class Animal{
    String Color;
    //Creating the Animal Constructor
    //bydefault all the objects color will be Brown until and unless they changeColor()

    //Here at first the Superclass Constructor class will be called and later its object class constructor will be called
    Animal(){
        Color ="Brown";
        System.out.println("Animal Constructor is called");
    } 
    void eat(){
        System.out.println("Eats");
    }

    //Animal a1 = new Animal();     here we cannot create object for animal because of abstraction
    //Animal gives an idea that how its objects walks and all its objects should have method walk()
    abstract void walk();
    //abstract implementation is seen in all the extended classes
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is called");
    }
    void changeColor(){
        Color = "Black";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor is Called");
    }
    void changeColor(){
        Color = "White";
    }
    void walk(){
        System.out.println("The Chincken walks on 2 legs");
    }
}
