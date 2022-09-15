
// write a program to print 
// prime numbers with in n? 
// 1 is a prime number


import java.util.*;
class PrimeLoop{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.print("1 ");
for(int i=2;i<=n;i++){
boolean k=true;
for(int j=2;j<=i/2;j++){
if(i%j==0){
k=false;
}}
if(k){
System.out.print(i+" ");
}}
}}

