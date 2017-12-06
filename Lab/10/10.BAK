#include<stdio.h>
#include<conio.h>
int search(int arr[],int number);
void main()
{

   int arr[10]={1,5,4,8,9,2,0,6,11,7};
   int number;
   int result = 0;
   clrscr();

   printf("\nEnter number :: ");
   scanf("%d",&number);

   result = search(arr,number);

   if(result)
      printf("\n YES");
   else
     printf("\n NO");
   getch();
}
int search(int arr[],int number)
{
   int i=0;
   for(i=0;i<10;i++)
   {
      if(arr[i] == number)
	 return 1;
   }
   return 0;
}