class S_tudent{
    int roll;
    String name;
    String course;
    int m1,m2,m3;
    public float Total(){
        return m1+m2+m3;
    }
    public double Average(){
        return Total()/3.0;
    }
    public void  Grade(){
        if(Average()>=60) System.out.println("A");
        else System.out.println( "F" );
    }
    public void Display(){
        System.out.println("Roll: "+roll+" "+ "Name:  "+name+" "+"Course:  "+course);
    }
     
}
public class Student {
    public static void main(String[] args) {
        S_tudent s=new S_tudent();
        s.roll=7;
        s.name="Biswajit";
        s.course="Mca"; 
        s.m1=58;
        s.m2=94;
        s.m3=76;
        System.out.println("Total: "+s.Total());
        System.out.println("average: "+s.Average());
        s.Grade();
        s.Display();
        
    }
}
