class Circle{
    double radius;  // properties or data members 
    public double Area(){             //methods or function
        return Math.PI*radius*radius;
    }
    public double Circumtance(){
        return 2*Math.PI*radius;
    }
    public double Perimeter(){
        return Circumtance();
    }
}
public class Opps {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        c1.radius=7;
       System.out.println("Area_1:"+c1.Area());
       System.out.println("Circumtance_1:"+c1.Circumtance());
       System.out.println("perimeter_1:"+c1.Perimeter());
        c2.radius=8;
        System.out.println("Area_2:"+c2.Area());
        System.out.println("Circumtance_2:"+c2.Circumtance());
        System.out.println("perimeter_2:"+c2.Perimeter());
    }
}
