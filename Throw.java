public class Throw {
    public static void dis(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible");
        }else{
            System.out.println("You can vote.");
        }
    }
    public static void main(String[] args) {
        dis(20);
    }
}
