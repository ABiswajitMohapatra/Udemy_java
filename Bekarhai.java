public class Bekarhai {
    
    public static void main(String[] args) {
         Super s=new Super();
         s.display();
         Sub c=new Sub();
         c.display();
         Super b=new Sub();
         b.display();
    }
}
class Super{
    public void display(){
        System.out.println("Hey how are ypu");
    }
    public void kuchhbhi(){
        System.out.println("bcsjhbjsb");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("nehi nehi nehi ");
    }
    public void kuchhbhi(){
        System.out.println(" nah nah nan=h");
    }
}