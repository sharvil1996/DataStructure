#include<stdio.h>
#include<conio.h>
void main()
{
   int square[50][50];
   int rectAngle[50][50];
   int row,column;
   int cnt=0;
   int i=0,j=0;
   int flag = 1;
   int temp[10];
   int t;
   clrscr();
   printf("\nEnter number of rows and column for Rectangle Matrix :: ");
   scanf("%d %d",&row,&column);
   for(i=0;i<row;i++)
   {
      for(j=0;j<column;j++)
      {
	 printf("Enter [%d][%d] :: ",i+1,j+1);
	 scanf("%d",&rectAngle[i][j]);
	 if(rectAngle[i][j] == 0)
	   cnt++;
      }
   }


   printf("\nEnter number of rows for Square Matrix :: ");
   scanf("%d",&row);
   for(i=0;i<row;i++)
   {
      for(j=0;j<row;j++)
      {
	 printf("Enter [%d][%d] :: ",i+1,j+1);
	 scanf("%d",&square[i][j]);
	 if(i==j)
	 {
	    temp[t] = square[i][j];
	    t++;
	 }

      }
   }

   for(i=0;i<t-1;i++)
   {
      if(temp[i] == temp[i+1]){}

      else
	 flag = 1;
   }
   printf("\n In Rectangular Matrix, There are Total %d Zeros",cnt);
   if(flag)
     printf("\n Elements of square matrix are NOT Diagonal");
   else
     printf("\n Elements of square matrix are Diagonal");


   getch();

}