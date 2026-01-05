
public class GettersSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();                //this creates new object p1 in the heap
        p1.setColor("Blue");      //we set the color Blue using setter method
        System.out.println(p1.getColor()); //we print th eColor using getter method
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    String Color;
    int tip;

    String getColor(){
        return this.Color;   //this function which maps to the corresponding object that called the function
    }                        //and this helps to identify the particular object when the another variable has same name 

    int getTip() {
        return this.tip;
    }
    void setColor(String newColor){
        this.Color = newColor;
    }

    void setTip(int newtip){
        this.tip = newtip;
    }
}
