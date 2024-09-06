import java.util.*;

public class find_missing_elem_sorted {
    public static int missingNumber(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }
    public static void main(String[] args) {
        // int a[]={1,3,4,5,6};
        // int n=a[a.length-1];
        // int sum1=(n*(n+1))/2;
        // System.out.println(sum1);
        // int sum2=0;
        // int mis_elem;
        // for(int i=0;i<a.length;i++){
        // sum2+=a[i];
        // }
        // System.out.println(sum2);
        // mis_elem=sum1-sum2;
        // System.out.println(mis_elem);
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);

    
    

    }
    
}
