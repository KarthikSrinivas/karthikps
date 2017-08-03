#include<stdio.h>
int fun(int);
void main()
{
int n,n1;
scanf("%d",&n);
n1=fun(n);
printf("%d",n1);
}
int fun(int n)
{
if(n==1)
{
return 1;
}
if(n==0)
{
return 0;
}
return n*fun(n-1);
}


