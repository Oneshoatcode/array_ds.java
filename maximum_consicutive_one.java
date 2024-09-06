public class maximum_consicutive_one {
    public static void main(String[] args) {
        int a[]={1,1,0,0,1,1,1,1,0,1};
        int maxi=0;
        int count=0;
        for ( int i = 0; i < a.length; i++) {
            if(a[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
           else{
               count=0;
           }
        }
        System.out.println("maximum number of onr is="+maxi);
    
    }
    
}
