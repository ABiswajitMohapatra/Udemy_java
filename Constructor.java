public class Constructor {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,8);
        System.out.println(r.Area());
        r.setLength(6.8);
        r.setBreadth(1.5);
        System.out.println(r.Area());
    }
}
class Rectangle{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double  getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public  Rectangle() {
        length=12;
        breadth=10;
      }
      public  Rectangle(double l,double b) {
        length=l;
        breadth=b;
      }
      public double Area(){
        return length*breadth;
      }
}