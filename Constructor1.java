public class Constructor1 {
    public static void main(String[] args) {
        Grandchild obj=new Grandchild();
    }
}
class Parent{
    public Parent(){
        System.out.println("parent cons is called....");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child cons is called....");

    }
}
class Grandchild extends Child{
    public Grandchild(){
        System.out.println("Grandchild cons is called....");
    }
}