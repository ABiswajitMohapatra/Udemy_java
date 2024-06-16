public class Rotation {
    public static void main(String[] args) {

        //left rotation:
     /*   
        int A[]={2,6,8,4,5,9};
        for(int x:A){
            System.out.print(x+" ,");
        }
        System.out.println();
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A){
            System.out.print(x+" ,");
        }

    */

    //Right Rotation:

    // int A[]={23,67,89,45,61};
    // int temp=A[A.length-1];
    // for(int i=A.length-1;i>0;i--){
    //     A[i]=A[i-1];
    // }
    // A[0]=temp;
    // for(int x:A){
    //     System.out.print(x + " ");
    // }



    // int A[]=new int[6];
    // int n=5;
    // int index=2;
    // int x=100;
    // A[0]=12;A[1]=34;
    // A[2]=56;
    // A[3]=78;
    // A[4]=90;
    // for(int i=n;i>index;i--){
    //     A[i]=A[i-1];
    // }
    // A[index]=x;
    // for(int z : A) {
    //     System.out.println(z);
    // }

    //copying an array:

  // int A[]={12,34,56,78,90,15};
//    int B[]=new int[6];
//    for(int i=0;i<A.length;i++){
//     B[i]=A[i];
//    }
//    for(int i=0;i<B.length;i++){
//     System.out.println(B[i]);
//    }

   //reverse copy:
   int A[]={12,34,56,78,90,15};
   int B[]=new int[6];
   for(int i=0;i<A.length;i++){
    B[A.length-1-i]=A[i];
   }
   for(int i=0;i<B.length;i++){
        System.out.println(B[i]);
       }

}
}
