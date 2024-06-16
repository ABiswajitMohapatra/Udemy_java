public class Anonymous {
    public static void main(String[] args) {
        Super s=new Super(){
          public void meth(){
            System.out.println("Hey ,How are you?");
          }
        };
        s.meth();
    }
}
interface Super{
    void meth();
}