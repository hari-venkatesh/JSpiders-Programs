
// program to print the number is 
// xylem or phloem



import java.util.*;
class Own{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int e=0;
int m=0;
int b=a;
e=a%10;
a=a/10;
String k=String.valueOf(a%10);
a=a/10;
while(a!=0){
k+=a%10;
a=a/10;
}
int c=Integer.valueOf(k);
e+=c%10;
c=c/10;
while(c!=0){
m=m+(c%10);
c=c/10;
}
if(e==m){
System.out.println("xylem");
}
else{
System.out.println("phloem");
}
}
}