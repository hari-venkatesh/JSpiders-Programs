
// write a program to print true 
// if number is palindrome otherwise 
// print false



import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        if(n==0)
        {
            System.out.println("true");
        }
        else
        {
            String k=String.valueOf(n%10);
            n=n/10;
            while(n!=0)
            {
                k+=n%10;
                n=n/10;
            }
            int m=Integer.valueOf(k);
            if(r==m)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}