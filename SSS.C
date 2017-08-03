#include<stdio.h>
void main()
{
static int p,k;
int q[100];
//int a[100][100];
int visited[100];
int n=4,i2,j3;
int src=0;
int s,d;
int e=4,j1,i,j;
int a[4][4]={{0,1,0,1},
	   {1,0,1,0},
	   {0,1,0,1},
	   {1,0,1,0}};
clrscr();
for(i=0;i<n;i++)
{
visited[i]=0;
}
visited[src]=1;
printf("%d",src);
lab:
for(i2=p;i2<n;i2++)
{
for(j3=0;j3<n;j3++)
{
if(a[i2][j3]==1)
{
if(visited[j3]!=1)
{
printf("\t%d",j3);
visited[j3]=1;
p=j3;
goto lab;
}
}
}
}
}

