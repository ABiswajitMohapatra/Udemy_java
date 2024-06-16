public class This {
    public static void main(String[] args) {
        Circle c=new Circle(12.3,56.7);
        c.display();
    }
}
class Circle{
    public double length;
    public double breadth;
    public Circle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void display(){
        System.out.println("length"+" "+this.length);
        System.out.println("breadth"+" "+this.breadth);
        
    }
}