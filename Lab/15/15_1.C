#include<stdio.h>
#include<conio.h>
void genratePattern(int n);
void main()
{
   int n;
   clrscr();
   printf("\nEnter  a number :: ");
   scanf("%d",&n);
   genratePattern(n);
   getch();
}

void genratePattern(int n)
{
    int i,j;
    for(i=0;i<n;i++)
    {
       printf("\n");
       for(j=0;j<=i;j++)
	  printf("%d",j+1);
       for(j=i-1;j>=0;j--)
	  printf("%d",j+1);

    }
}