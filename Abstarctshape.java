public class Abstarctshape {
    public static void main(String[] args) {
       // Shape s=new Circle();
        Circle s=new Circle();
        s.radius=7.2;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        Rectangle r=new Rectangle();
        r.length=8;
        r.breadth=3;
        System.out.println("Area:  "+r.area());
        System.out.println("perimeter:  "+r.perimeter());
    }
}
abstract class Shape{
    //public double radius;
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
     public double radius;
    public double  perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius *radius;
    } 
}
class Rectangle extends Shape{
    public double length, breadth;
    public double perimeter() {
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}