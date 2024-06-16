public class Car {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.start();
        c.accelerate();
        c.changegear();
        Luxarycar l=new Luxarycar();
        l.start();
        l.accelerate();
        l.changegear();
        l.openroof();
        Car1 b=new Luxarycar();
        b.start();
        b.accelerate();
        b.changegear();
       // b.openroof();//you can't call openroof : because b reference only knows the super class method not the sub class .
       
    }
}
class Car1{
    public void start(){
        System.out.println("Car is Starting...");
    }
    public void accelerate(){
        System.out.println("Car is Accelerating...");
    }
    public void changegear(){
        System.out.println("car Gear is Changing...");
    }
}
class Luxarycar extends Car1{
    public void changegear(){
        System.out.println("LuxaryGear is Changing...");
    }
    public void openroof(){
        System.out.println("open sun roof...");
    }
}

//Dynamic method dispatch-->
//super class reference can have sub class object but not vice versa.
//method will be called depending upon object not the refernce.
//why it is called  dynamic? because at runtime JVM decides which function to call.
//dynamically we create using new  keyword .
//{  when inheritance is involved and methods are overridden in subclasses,
// dynamic method dispatch allows the JVM (Java Virtual Machine) to determine which version
// of the method to execute based on the actual type of object the reference variable is pointing to at runtime.}