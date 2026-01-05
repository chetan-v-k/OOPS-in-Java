//Multiple Inheritance 
public class MultipleInheritance{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.name = "Parrot";
        System.out.println(bird.name);
        bird.eat();
        bird.walk();
        bird.fly();
    }
}

class animal{
    String name;
    void eat(){
        System.out.println("Eats");
    }
}

class Mammal extends animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Bird extends Mammal{
    void fly(){
        System.out.println("Flies");
    }
}

