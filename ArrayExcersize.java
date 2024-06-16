public class ArrayExcersize {
    public static void main(String[] args) {

    /*
        int Arr[]={2,5,8,4,9};
        int sum=0;
        for(int i=0;i<Arr.length;i++){
            sum+=Arr[i];
        }
        System.out.println(sum);
    */
/*
    int A[]={20,30,40,50,60};
    int key=30;
    for (int i=0;i<A.length;i++){
        if(A[i]==key){
            System.out.println(i);
            System.exit(0);
        }
    }
    System.out.println("Not found");

    */
/*
    int A[]={23,14,67,111,22,89,19,10};
    int max=A[0];
    for(int i=0;i<A.length;i++){
        if(A[i]>max){
            max=A[i];
        }
    }
    System.out.println(max);
*/

    int A[]={56,38,49,20,80,33};
    int max1=A[0];
    int max2=A[0];
    for(int i=0;i<A.length-1;i++) { 
        if(A[i]>max1){
            max2=max1;
            max1=A[i];
        }else if(A[i]>max2){
            max2=A[i];
        }
    }
    System.out.println(max2);

}
}
