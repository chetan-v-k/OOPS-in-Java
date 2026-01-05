package DSA.OOPs;

import javax.print.attribute.Size2DSyntax;

public class Static {
    public static void main(String argsp[]){
        Student S1 = new Student();
        S1.schoolName = "BPPHS";

        Student S1 = new Student();
        S2.schoolName = "BIPS";
    }
}

class Student{
    String Name;
    int roll;

    static String schoolName;

    void setName(String Name){
        this.Name = Name;
    }
    String getName(){
        return this.Name;
    }
}
