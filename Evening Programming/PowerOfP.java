
// write a java program to print 
// the n to the power of p? 
// ex: input1: 5 input2: 3 5*5*5 output : 125




import java.util.*;
class Power{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int k = 1;
while(m!=0){
k = k*n;
m--;
}
System.out.println(k);
}
}

