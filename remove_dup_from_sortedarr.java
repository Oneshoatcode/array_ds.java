import java.util.*;
// import java.util.HashSet;
public class remove_dup_from_sortedarr {
     public static void main(String[] args) {
    //     HashSet <Integer> hs=new  HashSet<>();
        int a[]={3,5,6,8,8,8,9,9};
    //     for(int i=0;i<a.length;i++){
    //         hs.add(a[i]);
    //     }
    //     for(Integer s:hs)
    //     System.out.println(s);
  
        int i=0;
        for(int j=1;j<a.length;j++){
        if(a[i]!=a[j]){ 
            i++;
            a[i]=a[j];
        
        }
    }
    for( int k=0;k<=i;k++){
       System.out.println(a[k]);}
}
}
