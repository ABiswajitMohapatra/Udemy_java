public class Exceptioninterface {
    public static void main(String[] args) {
        Display d=new Dis();
        d.meth1();
        d.meth2();
        // d.meth3();
        //Display.meth4(); /// direct call because of static 
        System.out.println(d.x);
        d.meth6();
    }
}
interface Display{
    int x=8;
    public abstract void meth1();
    public abstract void meth2();

    //INTERFACE CAN HAVE DEFAULT AND STATIC METHOD  ALSO BUT THEY ARE NOT ABSTRACT:
    // default void meth3(){
    //     System.out.println("Default method is called....");
// }

//STATIC METHOD:

    // public static void meth4(){
    //     System.out.println("Static method is called");
    // }

// INTERFACE CAN ALSO HAVE PRIVATE METHOD BUT IT ONLY USE INSIDE THE DEFAULT  METHOD :
     private void meth5(){
        System.out.println("Private method is called");
     }
     default void meth6(){
        meth5();
     }
    }

class Dis implements Display{
    public  void meth1(){
        System.out.println("Method1 is called...");
    }
    public  void meth2(){
        System.out.println("Method2 is called...");
    }
}
