public class ParameterPassing {
    static void update(int A[]){
        A[0]=89;
        A[3]=101;
    }
    public static void main(String[] args) {
        int A[]={12,45,67,90,35};
        update(A);
        System.out.println(A[0]);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
