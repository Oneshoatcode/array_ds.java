import java.util.HashSet;

public class union_of_sorted_arr {
    public static void main(String[] args) {
        int a1[]={6,4,7,7,9};
        int a2[]={0,5,7};
        int n1=a1.length;
        int n2=a2.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n1;i++){
            hs.add(a1[i]);
        }
        for(int i=0;i<n2;i++){
            hs.add(a2[i]);
        }
     
        for(Integer m:hs){
            System.out.println(m);
        }
    }
    
}
