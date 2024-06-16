public class Abstraction {
    public static void main(String[] args) {
        Sub obj=new Sub();
        obj.meth1();
        obj.meth2();
    }
}
abstract class Super{
    public void meth1(){
        System.out.println("Super meth 1 is calling....");
    }
    abstract public  void meth2();
}
class Sub extends Super{
    public void  meth1() {
        System.out.println("Sub  meth 1 is calling .... ");
        super.meth1();
    }
   
    public void meth2(){
        System.out.println("Sub  meth 2 is calling...");
    }
}