#include<stdio.h>
#define MAX 100
void main()
{
int i,j;
int n;
char str[MAX];
scanf("%s",str);
n=strlen(str);
for(i=0;i<n;i++)
{
if(str[i]>=65&&str[i]<=90)
{
str[i]=str[i]+32;
printf("%c",str[i]);
}
else if(str[i]>=97&&str[i]<=122)
{
str[i]=str[i]-32;
printf("%c",str[i]);
}
else if(str[i]>='0'&&str[i]<='9')
{
printf("invalid literal");
}
else
{
}
}
}


