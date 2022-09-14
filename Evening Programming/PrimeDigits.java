
// write a java program to print 
// how many prime digits present in the number?
// ex:2341 output:3 (2 3 and 1 is prime digits) 




import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            System.out.println(n);}
        else{
            int k = 0;
            while(n!=0){
                k = (n%10);
                if(k!=4 && k!=6 && k!=8 && k!=9){
                    count++;}
                n = (n/10);}}
        System.out.println(count);
}
}