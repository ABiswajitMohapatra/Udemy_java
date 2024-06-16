public class Override {
    public static void main(String[] args) {
        TV obj=new TV();
        obj.switchon();
        obj.changechannel();

        SmartTv s=new SmartTv();
        s.switchon();
        s.changechannel();
        s.switchof();

        TV t=new SmartTv();
        t.switchon();
        t.changechannel();
    }
}
class TV{
    public void switchon(){
        System.out.println("TV switch is on....");
    }
    public void changechannel(){
        System.out.println("Tv channel is change...");
    }
}
class SmartTv extends TV{

    public void switchon(){
        System.out.println("SmartTv switch is on....");
    }
    public void changechannel(){
        System.out.println("SmartTv channel is change...");
    }
    public void switchof(){
        System.out.println("SmartTv switch is of...");
    }
}