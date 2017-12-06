#include<stdio.h>  //Standart input output header
#include<conio.h> //Concole input output header 
int fectorial(int n);
void main()
{
   //Declaring Variable
   
   int n;
   
   clrscr();
   
   printf("\n Enter a number :: "); 
   scanf("%d",&n);  //Take input from user
 
   //Call Function and Displaying Result
   printf("\n Fectorial of %d number is %d",n,fectorial(n));
   
   getch();
}
int fectorial(int n)
{
   if(n==1)
      return 1;
   else
     return (n*(fectorial(n-1)));
}s