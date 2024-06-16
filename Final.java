public class Final {
    public static void main(String[] args) {
        
    }
}
//Final variable can't be modify
//Final class can't be extended
//Final method can't be overide 
class Test{
    final int x=90;
    final void meth1(){
        System.out.println("meth1 called...");
    }
}
class  Test2 extends Test{
    int x=80; //Error: The final field cannot be shadowed by a new variable in the superclass
    void meth2(){
        System.out.println("meth2 called...");
    }
    void meth1(){
        System.out.println( "Inside the Test2 class" );//we cn't override the final method
    }
}