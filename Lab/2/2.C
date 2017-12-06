#include<stdio.h>
#include<conio.h>
void main()
{

   int marks[5],total=0,i;
   float per=0.0;
   clrscr();

   printf("\nEnter marks of 5 Subjects sepereted by Spaces ::\n");
   for(i=0;i<5;i++)
       scanf("%d",&marks[i]);
   for(i=0;i<5;i++)
      total += marks[i];
   per = total / (float)5;
   printf("\n Total : %d ",total);
   printf("\n Percentage : %f",per);

   getch();
}