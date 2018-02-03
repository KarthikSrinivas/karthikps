import java.io.*;
import java.util.*;
public class Triplet
{
 static int count;
  public static void main(String ae[])
  {
   Triplet t=new Triplet();
   Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int a[]=new int[s];
    for(int p=0;p<s;p++)
     {
       a[p]=sc.nextInt();
      }
    System.out.println(t.call(a,s));
  }
 public int call(int b[],int s1)
 {
   for(int i=0;i<b.length;i++)
   {
     for(int j=i+1;j<b.length;j++)
     {
       for(int k=j+1;k<b.length;k++)
       {
          if(a[i]+a[j]+a[k]==s1)
          {
            count++;
          }
        }
      }
    }
   return count;
 }
}