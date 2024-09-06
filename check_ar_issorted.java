public class check_ar_issorted {
    public static boolean check_sorted(int a[]){
for(int i=1;i<a.length;i++){
    if(a[i]<a[i-1]){
    return false;
    }
}
return true;
    }
public static void main(String[] args) {
    int a[]={1,4,6,7,9};
   boolean m= check_sorted(a);
   System.out.println(m);
  
}
    
}
