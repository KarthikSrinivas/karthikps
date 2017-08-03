#include<stdio.h>
void main()
{
int a1[100];
int i5,f=0;
int a2[100];
int flag1[100];
int i1,i,j,j1,temp,temp1;
int flag2[100],i4;
static int count,count1,p,p1;
char str1[100];
char str2[100];
int n1=strlen(str1);
int n2=strlen(str2);
scanf("%s",str1);
scanf("%s",str2);
for(i1=0;i1<n1;i1++)
{flag1[i1]=0;
 flag2[i1]=0;
}
for(i=0;i<n1-1;i++)
{  count=1;
for(j=i+1;j<n1;j++)
{ if(str1[i]==str1[j])
   {
    ++count;
       flag1[j]=1;
    }
}
if(flag1[i]!=1)
{
a1[p]=count;
++p;
}}
for(i1=0;i1<n2-1;i1++)
{
count1=1;
for(j1=i1+1;j1<n2;j1++)
{
if(str2[i1]==str2[j1])
{
++count1;
flag2[j1]=1;
}
}
if(flag2[i1]!=1)
{
a2[p1]=count1;
++p1;
}
}
//printf("p is %d",p);
for(i4=0;i4<p;i4++)
{
if(a1[i4]>a1[i4])
{
 temp=a1[i4];
 a1[i4]=a1[i4+1];
 a1[i4+1]=temp;
 }
 if(a2[i4]>a2[i4])
 {
 temp1=a2[i4];
 a2[i4]=a2[i4+1];
 a2[i4+1]=temp1;
 }
}
  for(i5=0;i5<p;i5++)
  {
  if(a1[i5]!=a2[i5])
  {
  f=1;
  }
  }
  if(f==0)
  {
  printf("true");
  }
  else
  {
  printf("false");
  }}
