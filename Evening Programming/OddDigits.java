
// write a program to print how many 
// odd digits present in the number: 

// ex: 45792 out put is: 3




import java.util.*;
class Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println(n);}
        else{
            int count=0;
            int k = 0;
            while(n!=0){
                k = n%10;
                if(k%2!=0){
                    count++;}
                n = n/10;}
            System.out.println(count);}
}
}