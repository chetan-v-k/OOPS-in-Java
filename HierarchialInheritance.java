package DSA.OOPs;

public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.name = "Whale";
        System.out.println(f1.name);
        f1.Breathe();
        f1.eat();
        f1.swim();
        //whale.walk();    //this object has no property of walking which is th eproperty of another object
    }
}

class Animal{
    String name;

    void eat(){
        System.out.println("Eats");
    }
    void Breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}