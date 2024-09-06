
public class check{
    
    public static void main(String args[]) {
    int n1=10;
    int n2=25;
    int count=0;
    for(int i=2;i<n2;i++){
        if(n1%i==0){
            count ++;
            n1++; 
        }
     
    }
  
   
if(count==1){
    System.out.println(n1);
}

    }
}

    
