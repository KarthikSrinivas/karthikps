import java.io.*;
import java.util.*;
import java.lang.*;
public class Rev
{
public static void main(String aw[])
{
Rev r=new Rev();
Scanner sc=new Scanner(System.in);
String userstring=sc.next();
String reversed=r.reves(userstring);
System.out.println(reversed);
}
public String reves(String str)
{
String str1="";
String p[]=str.split(" ");
int len=p.length();
for(int i=len-1;i>=0;i--)
{
str1=" "+str1+p[i];
}
return str1;
}
}
