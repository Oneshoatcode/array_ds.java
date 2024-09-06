public class removeZero_toTheEnd {
    public static void main(String[] args) {
        int a[]={4,1,0,4,1,6,0,0,4,0,3,0,0};
        int n=a.length;
        // int temp[]=new int[n];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(a[i]!=0){
        //         temp[j]=a[i];
        //         j++;
        //     }
        // }
        // for( j=0;j<temp.length;j++){
        //     System.out.print(" "+temp[j]);
        // }


        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){ 
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}
