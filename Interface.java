public class Interface {
    public static void main(String[] args) {
        Test t=new Exam();
        t.meth2();
        t.meth1();
    }
}
interface Test{
    void meth1();
    void meth2();
}
class Exam implements Test{
    public void meth1(){
        System.out.println("methi is calling...");
    }
    public void meth2(){
        System.out.println("meth2 is calling...");
    }
}