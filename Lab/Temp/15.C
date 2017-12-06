#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
void genratePattern(int n);
void main()
{
   //Declaring Variable
   int n;
   clrscr();
   printf("\nEnter  a number :: ");
   scanf("%d",&n); //Scan the number
   genratePattern(n); //Call function
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