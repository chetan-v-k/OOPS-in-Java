package DSA.OOPs;

public class Interface {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
        c1.do_not_eat_meat();

        // Queen Q1 = new Queen();
        // Q1.Moves();
    }
}
//Example of Multiple Inheritance
interface Herbivore{
    void eat();
}

interface Carnivore{
    void do_not_eat_meat();
}

class Cow implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Cow eats Grass");
    }
    public void do_not_eat_meat(){
        System.out.println("The Cow do not eat Mean");
    }
}

//Example of Interface (blueprint of class)
interface ChessPlayer{
    void Moves();    //We have just given the Blueprint, not implementation
}

//Implementation is given in classes
class Queen implements ChessPlayer{
    public void Moves(){  //we have to arite public else it will take 'default'
        System.out.println(" Up, Down, Left, Right, Diagonal(in all 4 dirns) ");
    }
}

class Rook implements ChessPlayer{
    public void Moves(){
        System.out.println("Up, down, left, right");
    }
}

class king implements ChessPlayer{
    public void Moves(){
        System.out.println("Up, down, right, left, Diagonal(1 step)");
    }
}