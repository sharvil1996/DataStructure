#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
#include<String.h> //String header
int roundUp(int a,int b);
void main()
{

   //Declaring Variable
   
   int a;
   int b;
   int result = 0;
   
   clrscr();

   printf("\nEnter A :: ");
   scanf("%d",&a);  //Enter  number 1

   printf("\nEnter B :: ");
   scanf("%d",&b); //Enter  number 2

   result = roundUp(a,b);  //Call function

   printf("\n Round up Division is %d",result);  //Display result

   getch();
}
int roundUp(int a,int b)
{
    return ((float)a/b+0.5);
}