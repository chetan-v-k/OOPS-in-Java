package DSA.OOPs;
public class HybridInheritance {
    public static void main(String[] args) {
        Eel e1 = new Eel();
        e1.name = "Eel";
        System.out.println("the fish name is: " + e1.name);
        e1.fins = 2;
        System.out.println("It has: " + e1.fins + " fins");
        e1.eat();
        e1.swim();
        e1.electric();
    }
}
class Animal{
    String name;
    void eat(){
        System.out.println("eats");
    }
}

//Fish --> Eel
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
class Eel extends Fish{
    void electric(){
        System.out.println("Gives electric shock");
    }
}

//Bird --> Peacock 
class Bird extends Animal{
    int feathers;
    void fly(){
        System.out.println("Flies");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("Peacock dances in the rain");
    }
}

//Mammal --> Cat
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    } 
}

class Cat extends Mammal{
    void drink(){
        System.out.println("The cat drinks Milk");
    }
}