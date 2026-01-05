//Single Inheritance

public class Inheritance{
    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.eat();
        whale.breathe();
        whale.swims();
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims");
    }
}