
// write a java program to print 
// the biggest digits in the number? 
// input:464787 output:8


import java.util.*;
class Biggest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = n%10;
n=n/10;
int r = 0;
while(n!=0){
r = n%10;
if(r>k){
k=r;
}
n=n/10;
}
System.out.println(k);
}
}

