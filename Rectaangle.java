class Rectangle{
    double length;
    double breath;
    public double Area(){
        return  length*breath;
    }
    public double perimeter(){
        return 2*(length+breath);
    }
    public boolean isSquare(){
        if(length==breath){
            return true;
        }else{
            return  false;
        }
    }
}
public class Rectaangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=6.9 ;
        r.breath=6.9;
        System.out.println("Area: "+r.Area());
        System.out.println("perimeter: "+r.perimeter());
        System.out.println("Is_square: "+r.isSquare());
    }
}
