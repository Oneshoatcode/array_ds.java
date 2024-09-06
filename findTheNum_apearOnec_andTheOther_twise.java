
import java.util.HashSet;

public class findTheNum_apearOnec_andTheOther_twise {
    public static void main(String[] args) {
        //BRUTFOORSE SOLUTION IS HERE
        int a[]={1,4,1,4,2,3,4,4,5,5,5,};
        HashSet<Integer> hs=new HashSet<>();
        for(int i = 0; i < a.length; i++) {
        int key=a[i];
        int count=0;
        if(hs.contains(key)){
            continue;}
        for (int j = 0; j < a.length; j++) {
        if(a[j]==key){
            count++;
        }
        }
        System.out.println(key+ " comes= " +count+" times");
        hs.add(key);
        }
    
    }
    
}
