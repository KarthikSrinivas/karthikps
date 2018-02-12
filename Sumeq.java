import java.io.*;
import java.util.*;
public class Sumeq
{
static int p;
 public static void main(String args[])
 {
   Sum s=new Sum();
     Scanner s1=new Scanner(System.in);
     int n1=sc.nextInt();
      int k1=sc.nextInt();
      s.method(n1,k1);
  }
 public boolean method(int n,int k)
 {
   Scanner sc=new Scanner(System.in);
  int a[]=new int[k];
   for(int i=0;i<k;i++)
    {
     a[i]=sc.nextInt();
     }
  outer:
   for(int j=0;j<k;j++)
   {
     for(int k1=j+1;k1<k;k++)
      {
        if((a[j]+a[k1])==n)
        {
           p=1;
           break outer;
         }
       }
    }
        if(p==1)
        {
         return true;
        }
        else 
        {
         return false;
        }
   }  