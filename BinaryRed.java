import java.io.*;
import java.util.*;
public class BinaryRed
{
static int count,p;
public static void main(String args[])
{

 Scanner sc=new Scanner(System.in);
 int n;
 System.out.println("enter the sizeof the array");
 n=sc.nextInt();
 int a[]=new int[n];
 int c[]=new int[n];
String bin[]=new String[n];
 for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
    bin[i]=Integer.toBinaryString(a[i]);
  }
 for(int k=0;k<n;k++)
  {
   int len=bin[k].length();
   char arr[]=bin[k].toCharArray();
   for(int k1=0;k1<len;k1++)
    {
     if(arr[k1]=='1')
     {
       ++count;
     }
    }
   c[p++]=count;
   }
 for(int i1=0;i1<n;i1++)
 {
 for(int j1=i1+1;j1<n;j1++)
  {
   if(c[i1]<c[j1])
   {
    int temp=c[i1];
    c[i1]=c[j1];
    c[j1]=temp;
    int temp1=a[i1];
    a[i1]=a[j1];
    a[j1]=temp;
   }
  }
 }
for(int k2=0;k2<n;k2++)
 {
 System.out.println(a[k2]);
 }
}
}
   