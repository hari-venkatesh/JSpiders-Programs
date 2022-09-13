
// write a java program to reverse the number? 
// ex:231 output:132 



import java.util.*;
class Reverse{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(n);}
        else{
        String r = String.valueOf(n%10);
        n = n/10;
        if(n==0){
            System.out.println(n);}
        else{
            while(n!=0){
                r += n%10;
                n = n/10;}}
        System.out.println(r);}
}
}
