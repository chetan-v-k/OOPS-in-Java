public class Classes{
    public static void main(String args[]){
        Pen p1 = new Pen();  //Here we ahve created a object P1 of class Pen.
        p1.setColor("Blue");
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.Tip);
        p1.Color = "Red";
        System.out.println(p1.Color);
    }
}
class Pen{    //here we have created a class Pen with properties - Color, and Tip.
    String Color;
    int Tip;

    void setColor(String newColor){
        Color = newColor;
    }
    void setTip(int newtip){
        Tip = newtip;
    }
}

class Student{
    String name;
    String section;
    int age;
    float percentage;

    void calc_perentage(int phy, int chem, int math, int bio){
        percentage = (phy + math + chem + bio)/4;
    }
}