public class Superclass {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(30,40,60);
        c.display();
        c.Display();
    }
}
class Circle{
    int length;
    int breadth;
    int x=10;
    public Circle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
class Cuboid extends Circle{
    int height;
    int x=20;
    public Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    public void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
    public void Display(){
        System.out.println(length+" "+breadth+" "+height);
    }
}