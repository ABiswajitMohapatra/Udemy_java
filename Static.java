public class Static {
    public static void main(String[] args) {
        Test t=new Test();
         t.display();
         t.dis();
        // // t.x=60;
        // // t.y=70;
         t.display();

        //STATIC METHOD OR VARIABLE CAN BE CALL WITHOUT OBJECT ALSO:
        System.out.println(Test.x);
        Test.dis();
    }
}
class Test{
    static int x=10;
    int y=20;
    void display(){
        System.out.println("Value of x: "+x);
        System.out.println( "Value of y: "+y);
    }
    static void dis(){
        System.out.println(x);//we can't access y in the static method ,static method only access the static memeber 
    }
}