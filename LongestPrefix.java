import java.io.*;
import java.util.*;
import java.lang.*;

public class LongestPrefix
{
 public static void main(String a[])
 {
  LongestPrefix p=new LongestPrefix(); 
  int n=sc.nextInt();
  String S[]=new String[n];
    for(int i=0;i<n;i++)
    {
     s[i]=sc.next();
    }
  String result=p.call(s);
 System.out.println(result);
}
 public String call(String str[])
 { 
   int a[]=new int[str.length];
   Set<Character> s=new HashSet<Character>();
    for(int k=0;k<str.length;k++)
    {
     a[k]=str[k].length();
    }
  int min=a[0];
  int ind=0;
    for(int l=1;l<str.length;l++)
    {
     if(a[k]<min)
      {
       min=a[k];
       ind=k;
      }
    }
  String com=str[k];
  char com1[]=new char[str[k].length()]; 
  Set<String> s=new HashSet<String>();
    for(char c:str.toCharArray())
    {
    s.add(c);
    }
int h=0;
int b[]=new int[20];
    while(h<str.length)
    {
     char a1[]=str[h].toCharArray();
      for(int j1=0;j1<com.length();j1++)
      {
   
       s.add(a1[j1]);
       if(s.add(a1[j1])!=false)
        {
         b[p]=j1;
          p++;
         continue lab;
        }
       }
  lab:
   h++;
  }
int min=b[0]; 
  for(int k1=0;k1<b.length();k1++)
   {
   if(min>b[k1])
     {
     min=b[k1];
     }
    }
String str2="";
   for(int l1=0;l1<min;l1++)
   {
     str2=str2+char.toString(com1[l1]);
   }
  return str2;
}

}        