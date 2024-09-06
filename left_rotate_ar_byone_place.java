public class left_rotate_ar_byone_place {
    public static void main(String[] args) {
        int a[]={3,6,4,1,8,6,0};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);}
    }
}
