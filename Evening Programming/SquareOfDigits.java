
// write a java program to print the 
// sum of square of digits? 

// input: 231(2*2+3*3+1*1) output: 14


import java.util.*;
class Square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int r = 0;
        int e = 0;
        if(n==0){
            System.out.println(n);}
        else{
            while(n!=0){
                k = n%10;
                r = k*k;
                e = e+r;
                n = n/10;}
           System.out.println(e);}
}
}
                