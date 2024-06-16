public class Methodoveride {
    public static void main(String[] args) {
        Message obj=new Message();
        obj.display();
        Child ch=new Child();
        ch.display();//(hidden parent class method  is called here)


        // IMPORTANT:
        Message m=new Child();
         m.display();//it will print child class method because ,always prefer obj class not the reference class 
        
    }
}
// METHOD OVERRIDE IS A REDEFINED METHOD OF SUPER AND SUB CLASS.
class Message{
    public void display(){
        System.out.println("Hello");
    }
}
class Child extends Message{
    //@Override
    public void display(){
        System.out.println("Hello ,Welcome..");
    }
}