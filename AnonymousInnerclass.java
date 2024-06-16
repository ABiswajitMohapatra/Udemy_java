abstract class Super{
  abstract void show();

}public class AnonymousInnerclass {
    public static void main(String[] args) {
        Super s=new Super(){
            void  show() {
                System.out.println( "I am an anonymous inner class" );  
            }
        };
        s.show();
    }
}






//Java anonymous inner class is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overloading methods of a class or interface, without having to actually subclass a class.

//In simple words, a class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface. Java Anonymous inner class can be created in two ways:

//Class (may be abstract or concrete).
//Interface