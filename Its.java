import java.io.*;
import java.util.*;
public class Its
{
static int k3,count;
public static void main(String ar[])
{
Its m=new Its();
String s;
Scanner sc=new Scanner(System.in);
s=sc.next();
int l=s.length();
int a[]=new int[l];
int p=(l-1);
int n=Integer.parseInt(s);
while(n>=1)
{
a[p]=n%10;
p--;
n=n/10;
}
for(int k=0;k<l;k++)
{
System.out.println(a[k]);
}
m.function(a,l);
}
public void function(int a[],int n1)
{
char words[]={'8','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 for(int i1=0;i1<n1;i1++)
 {
 System.out.print(words[a[i1]]);
 }
System.out.println("");
  for(int j1=0;j1<n1;j1++)
  { out:
    while(count<2)
    {
        if(j1<(n1-1))
    {
     k3=10*k3+a[j1+count];
     ++count;
    }
    else
    {
        k3=a[j1];
        break out;
    }
    }
     if(k3<26)
      {
      System.out.print(words[k3]);
      
      count=0;
      }
k3=0;

  }
}
}