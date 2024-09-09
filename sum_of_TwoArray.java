import java.util.*;

public class sum_of_TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array sizes
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // Initialize the arrays
        int a1[] = new int[n1];
        int a2[] = new int[n2];

        // Input first array elements
        System.out.println("first array elements");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        // Input second array elements
        System.out.println("second array elements");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        // Find the maximum size for the sum array
        int m = Math.max(n1, n2);
        System.out.println(m);

        // Initialize the sum array
        int sum[] = new int[m];

        // Start summing from the last index of both arrays
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;
        int carry = 0;

        // Loop to sum the arrays
        while (k >= 0) {
            int d = carry;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            carry = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }
System.out.println();
        
        // Print carry if it's not zero
        if (carry != 0) {
            System.out.print(carry);
        }

        // Print the sum array
        for (Object val : sum) {
            System.out.print(val);
        
        }
    }
}
