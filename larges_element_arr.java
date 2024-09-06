public class larges_element_arr {
    public static int  larg_elem(int a[]){
        
    int max=a[0];
    for (int i = 0; i < a.length; i++) {
        if(a[i]>max){
            max=a[i];
        }
        
    }
    return max;
    }
    public static void main(String[] args) {
        //broot force solution is ,you have sort the array and last
        //index is largest element is largest element in arry
        //{THIS SOLUTION IS OPTIMAL}
      int  a[]={5,55,33,7,2,99,103};
        int m=larg_elem(a);
        System.out.println(m);
    }
}
