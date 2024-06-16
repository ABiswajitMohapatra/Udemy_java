public class Multipleinterface {
    public static void main(String[] args) {
        Phone s=new Smartphone();
        s.call();
        s.sms();
        //s.icap();//we can't call this
        icamera c=new Smartphone();
        c.camera();
        c.click();
        iphone i=new Smartphone();
        i.icap();
        i.iselfie();
    }
}
class Phone{
    public void call(){
        System.out.println("phone call");
    }
    public void sms(){
        System.out.println("phone sms ...");
    }
}
interface icamera {
    void camera();
    void click();
}
interface iphone{
    void icap();
    void iselfie();
}
class Smartphone extends Phone implements icamera,iphone{
     public  void camera() {
        System.out.println("camera work");
    }
    public void click(){
        System.out.println("click the photo");
    }
    public void icap(){
        System.out.println("icap self");
    }
    public  void iselfie(){
        System.out.println("iselfie self");
    }
}