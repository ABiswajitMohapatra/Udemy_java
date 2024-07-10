public class Local {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        obj1.Outerfunc();
    }
}
class Outer{
    private int x=23;
    public void Outerfunc(){
        class Inner{
     final int y=90;
            public void InnerFunc(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner obj=new Inner();
        obj.InnerFunc();
    }
}