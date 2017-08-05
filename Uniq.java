import java.io.*;

import java.util.*;

public class Uniq

{

static int count,p;

public static int main(String g[])

 {

  int n;

  Uniq r=new Uniq();

  Scanner sc=new Scanner(System.in);
  
n=sc.nextInt();
  
int a[]=new int[n];

   for(int i=0;i<n;i++)
  
   {
  
    a[i]=sc.nextInt();
 
  }

  int k=r.pass(a,n);

  //System.out.println(k);
  return k;
 

 }

public int pass(int a[],int n)

{
  
 int ret=0;
 
int b[]=new int[n];
 
 int f[]=new int[n];
 
  for(int i=0;i<n;i++)
 
   {

    f[i]=0;
  
 }
  
  for(int i1=0;i1<n;i1++)
 
   {

       count=1;
  
  for(int j1=i1+1;j1<n;j1++)
 
    {
 
     if(a[i1]==a[j1])

     {
     
        ++count;
   
     f[j1]=1;

     }

    }

   if(f[i1]!=1)

    {

    b[p]=count;
  
    ++p;

    
}

   else

   {
   
    b[p]=0;

       ++p;
 
   } 
  
  }

  
  for(int r=0;r<p;r++)

    {

     if(b[r]==1)

     {
  
     ret=a[r];


     }

    }

 return ret;

 }

}