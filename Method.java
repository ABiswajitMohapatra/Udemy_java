/*public class Method {
    public static int max(int x,int y){//formal parameters
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=80;
        System.out.println(max(a,b));//Actual parameters 
    }
}
*/


//Actual parameters are only copying  the values of variables to formal parameters :
//if we change the value of formal parameter  inside method then it will not affect actual parameters because they are independent from each other:

//IMPORTANT:

public class Method{
    static void show(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a=10;
        show(a);      
        System.out.println(a);
    }
}