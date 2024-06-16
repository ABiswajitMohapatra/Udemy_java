public class Inheritance {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=7.5;
        c.height=9.5;
        System.out.println("Area"+c.area());
        System.out.println("Area"+c.volume());
    }
}
class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public  double circumference(){
        return 2*Math.PI*radius;
    }
    public double perimeter(){
        return circumference();
    }
}
class Cylinder extends Circle{
    public double height; 
    public double volume(){
        return area()*height;
    }
}