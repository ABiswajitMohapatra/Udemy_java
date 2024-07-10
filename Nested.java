public class Nested {
    public static void main(String[] args) {
        Outer obj=new Outer();
        Outer.Inner obj1=obj.new Inner();
        obj1.dis();
        obj.dis();
    }
}
class Outer{
    String name="Biswa";
    int age=21;
    float cgpa=5.6f;
    double salary=12.34;
    void dis(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(salary);
    }
    class Inner{
    String name="vish";
    int age=23;
    float cgpa=8.6f;
    double salary=122.34;
    void dis(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(salary);
    }
    }
}