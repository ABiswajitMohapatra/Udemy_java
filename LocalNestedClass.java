public class LocalNestedClass {
    public static void main(String[] args) {
        Super s=new Super();
        s.Dis();
    }
}
class Super{
    private int x=7;
    public void Dis(){
    final int y=5;
    class Local{
        public void  show() {
        System.out.println(x);
        System.out.println(y);
        }
    }
    Local l=new Local();
    l.show();

    }
}

//LOCAL NESTED CLASS ONLY ACCESSBLE INSEIDE THE METHOD AND  BLOCK WHERE IT IS DECLARED:
//OBJECT CREATION ALSO INSIDE WITHIN THE SUPER CLASS :