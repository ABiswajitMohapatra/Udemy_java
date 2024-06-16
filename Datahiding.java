public class Datahiding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(6.7);
        r.setBreadth(7.3);
        System.out.println("Area:"+r.Area());
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
// let us consider a tv ,you can see there are some buttoms in front of tv,it has switch onn,off,increase volume etc,but the main operation is running inside thge circuit or tv that is data hiding.
//if we want to hide our data then make the properties as private .if data memebers are private we can't access in the another class so have getter and setter method:
class Rectangle{
    private double length;
    private double breadth;


    //CREATION OF GETTER METHOD:  (READING)
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    // creating setter method:   (WRITING)
    public void setLength(double length){
        this.length=length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }


    //NORMAL METHOD:
    public double Area(){
        return length*breadth;
    }
}