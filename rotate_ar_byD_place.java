import java.util.Scanner;
//THIS IS OPTIMAL OPROACH OF ROTATING ARRAY
public class rotate_ar_byD_place {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9};
        int n=a.length;
        System.out.println("withot replace array");
         for(int i=0;i<n;i++){
        System.out.print(" "+a[i]);
         }
         System.out.println();
        System.out.println("enter D th element =");
        int d=sc.nextInt();
         d=d%n;
         int temp[]=new int[d];
         for(int i=0;i<d;i++){
            temp[i]=a[i];
         }
         for(int i=d;i<n;i++){
            a[i-d]=a[i];
         }
         for(int i=0;i<d;i++){
            a[n-d+i]=temp[i];
         }
         System.out.println("this is replaced by by d place");
         for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
         }
    }
    
}
