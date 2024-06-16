public class Super {
    public static void main(String[] args) {
        B obj=new B(10,20);
    }
}
class A{
    public A(){
        System.out.println("Non-parameter of parent class ");
    }
    public A(int x){
       System.out.println("parameter1"+" "+x);
    }
}
class B extends A{
    public B(){
        System.out.println("Non-parameter of child class");
    }
    public B(int y){
        System.out.println("parameter");
    }
    public B(int x,int y){
        super(x);
        System.out.println("parameter2"+" "+y);
    }
}