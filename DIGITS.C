#include<stdio.h>
void main()
{
int i;
static int p;
int n,n1;
int a[20];
scanf("%d",&n);
while(n>=1)
{
a[p]=n%10;
n=n/10;
++p;
}
for(i=0;i<p;i++)
{
printf("%d",a[i]);
}
}

