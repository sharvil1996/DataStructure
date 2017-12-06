#include<stdio.h>
#include<conio.h>
#include<string.h>
void fibo(int p);
void prime(int n);
int power(int x,int y);
void main()
{
   char str[100],str1[100];
   int pow=0;

   clrscr();
   printf("\nEnter String :: ");
   gets(str);
   printf("\nEnter String :: ");
   gets(str1);

   printf("\n Reverse String is %s",strrev(str));

   pow = power(strlen(str),strlen(str1));

   if(!strcmp(str,str1))
   {
      printf("\n GOOGLE");
      printf("\n %d ",pow);
      prime(pow);
   }
   else
   {
      printf("\n YAHOO");
      printf("\n %d",pow);
      fibo(pow);
   }
   getch();

}
void fibo(int n)
{
   int i=0,j=1;
   printf("\nFibonacci Series:: ");

   while(i<n)
   {
	printf("%d %d ",i,j);
	i=i+j;
	j=i+j;
   }
}
void prime(int n)
{
   int i,j,flag=0;
   printf("Prime numbers :: ");
   for(i=2;i<n;i++)
   {
     flag=0;
     for(j=2;j<=i/2;j++)
     {
	if(i%j==0)
	{
	   flag=1;
	   break;
	}
     }
     if(!flag)
	printf("%d ",i);
   }
}
int power(int x,int y)
{
  if(y==0)
     return 1;
  else
     return x*power(x,y-1);
}