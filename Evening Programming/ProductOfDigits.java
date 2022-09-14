
// write a program to calculate 
// product of digits? 
// ex: 342 3*4*2 24 is the output.




import java.util.*;
class Product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(n);}
        else{
            int p = 1;
            while(n!=0){
                p = p*(n%10);
                n = n/10;}
                System.out.println(p);}
}
}