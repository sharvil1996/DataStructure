#include<stdio.h>
#include<conio.h>
int checkAmicableNumber(int number1,int number2);
void main()
{
   int number1,number2;
   int ans=0;
   clrscr();
   printf("\nEnter a number 1 :: ");
   scanf("%d",&number1);
   printf("\nEnter a number 2 :: ");
   scanf("%d",&number2);


   ans = checkAmicableNumber(number1,number2);

   if(ans)
     printf("\n Amicalel number ");
   else
     printf("\n Not Amicable Number");

   getch();

}
int checkAmicableNumber(int number1,int number2)
{
   int i=0;
   int temp1=0,temp2=0;

   for(i=1;i<number1;i++)
   {
       if( number1 % i == 0 )
	   temp1 += i;
   }


   for(i=1;i<number2;i++)
   {
       if( number2 % i == 0 )
	   temp2 += i;
   }


   if(temp1==number2 && temp2 == number1)
      return 1;
   else
     return 0;



}