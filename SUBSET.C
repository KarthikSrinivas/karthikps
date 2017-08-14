#include<stdio.h>
#define MAX 100
void main()
{
int flag=0,i,i1,j;
int a[MAX];
int b[MAX];
int n,n1;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
scanf("%d",&n1);
for(j=0;j<n1;j++)
{
scanf("%d",&b[j]);
}
if(n1>=n)
{
flag=1;
}
else
{
for(i1=0;i1<n1;i1++)
{
if(b[i1]!=a[i1])
{
flag=1;
}
}
}
if(flag==0)
{
printf("arr2 is a subset of arr1");
}
else
{
printf("arr2 is not a subset of arr1");
}
}