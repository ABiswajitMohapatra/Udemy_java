public class Dynamicmethoddispatch {
    public static void main(String[] args) {
        //OBJECT CREATION OF SUPER CLASS:
        Super s=new Super();
        s.methd1();
        s.methd2();
        Sub sub = new Sub();
        sub.methd1();
        sub.methd2();
        sub.methd3();
        Super ref=new Sub();
        ref.methd1();
        ref.methd2();
        // ref.methd();

    }
}
class Super{
    public void methd1(){
        System.out.println("Super Method 1");
    }
    public void methd2(){
        System.out.println("Super  Method 2");
    }
}
class Sub extends Super{
    public void methd1(){
        System.out.println("Sub Methodjncv 1");
    }
    public void methd2(){
        System.out.println("Sub  Class Method 2");
    }
    public void methd3(){
        System.out.println("Sub  Class Method 3");
    }
}