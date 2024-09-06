import java .util.*;
public class binari_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your key element you search");
        int a[]={4,7,2,9,0,5,7};
        int h=a.length-1;
        int low=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int key=sc.nextInt();
        while (low<=h) {
        int mid=(low+h)/2;
        if(a[mid]==key){
            System.out.println("your item on index="+mid);
            return;
        }
        else if(a[mid]<key){
            low=mid+1;
        }  
        else{
            h=mid-1;
        }
            
        }
        System.out.println("key is not present in array");
            
        }
    }
    

