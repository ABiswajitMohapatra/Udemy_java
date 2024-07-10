/*
interface Mylambda{
    public void dis();
}
class base implements Mylambda{
   public void dis(){
    System.out.println("Hello world!");
   }
}
public class Lambdaexpression {
    public static void main(String[] args) {
        Mylambda obj=new base();
        obj.dis();
    }
}
 */
//lambda exprressions is used for defining anonimous function using interface.
// A interface with single abstract methos is called as functinal interface.

/*
interface Mylambda{
    public void dis();
}
public class Lambdaexpression {
    public static void main(String[] args) {
        Mylambda obj=new Mylambda(){
            public void dis(){
                System.out.println("Hello world");    //Anonimous class :
            }
        };
        obj.dis();
    }
}
*/
//lambda expression:

/*
interface Mylambda{
    public void dis();
}
public class Lambdaexpression {
    public static void main(String[] args) {
        Mylambda obj=()->{System.out.println("Hello world"); };
        obj.dis();
    }
}
*/



//lambda expression taking parameter:
/*
interface Mylambda{
    public void dis(String str);
}
public class Lambdaexpression {
    public static void main(String[] args) {
       Mylambda obj=(str)->{System.out.println(str);};
       obj.dis("hello world");
    }
    
}
*/
//Int:
/*
interface Mylambda{
    public int add(int a,int b);
}
public class Lambdaexpression {
public static void main(String[] args) {
    Mylambda obj=(a,b)->{return a+b;};
    System.out.println(obj.add(8,7));
 }
}
*/

/*
interface Mylambda{
    public int add(int a,int b);
}
public class Lambdaexpression {
public static void main(String[] args) {
    Mylambda obj=(a,b)->a+b;
    System.out.println(obj.add(8,7));
 }
}
*/

//LAMBDA EXPRESSION AS LOCAL VARIABLE:
/*
interface Mylambda{
    public void dis();
}
class base{
    public void dis(){
       Mylambda obj=()->{System.out.println("hello world");
       System.out.println("Hi , champion");
       System.out.println("hey how are you?");
    };
       obj.dis();
    }
}
public class Lambdaexpression {
    public static void main(String[] args) {
        base obj = new base();
        obj.dis();
     }
    }
     */

     interface Mylambda{
        public void dis();
    }
    class base{
        int y=78;
        public void dis(){
            int x=9;
            Mylambda obj=()->{System.out.println(x);
                //System.out.println(x++); //we can't modify because it,s final 
                System.out.println(y);
                System.out.println(y++);
                System.out.println(y); // it is possible
            };
            obj.dis();
        }
    }
    public class Lambdaexpression {
        public static void main(String[] args) {
            base obj = new base();
            obj.dis();
         }
        }