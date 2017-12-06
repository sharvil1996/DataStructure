#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
int search(int arr[],int number);
void main()
{

   //Declaring Variable
   
   int arr[10]={1,5,4,8,9,2,0,6,11,7};
   int number;
   int result = 0;
   
   clrscr();

   printf("\nEnter number :: ");
   scanf("%d",&number);  //Take input from user

   result = search(arr,number);  //Call search function

   //Displaying result
   
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