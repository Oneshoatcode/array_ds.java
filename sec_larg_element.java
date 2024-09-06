public  class sec_larg_element {
    public static void main(String[] args) {
      /*   [first of all we discuss about broot force solution is 
       you have to sort(in reversr) the ayyar and 
       travers sec larg index from opposite direction ]

       Array.sort(a,collection.reverseorder());
       larg=a[i];
       for (int i = n-2; i>=0; i--) {
       if(a[i]!=larg){
       int sec_larg=a[i]
       brek;
       }

    }*/

//now best cace slution 
int a[]={6,3,6,2,1,7,9};
int max=a[0];
for (int i = 0; i < a.length; i++) {
    if(a[i]>max){
        max=a[i];
    }
}
    System.out.println(max);
int sec_lar=-1;
for(int i=0;i < a.length;i++){
    if(a[i]>sec_lar && a[i] != max){
        sec_lar=a[i];
    }
}
System.out.println("sec_larg=" +sec_lar);
    
    }
    
    }

