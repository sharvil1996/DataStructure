#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
#include<string.h> //String header
void main()
{
   //Declaring Variable

   char isCheck[100];
   char temp[100];
   int i=0,len=0;
   int flag = 0;
   
   clrscr();
   
   printf("\nEnter String :: "); 
   gets(isCheck); //Input from User

   len = strlen(isCheck); //Counting Length
   
   //Genrateing Reverse String
   
   while(isCheck[i]!='\0')
   {
      len--;
      temp[i] = isCheck[len];
      i++;
   }
   temp[i+1] = '\0';

   //Set Flag value if String is Palindrom
   
   for(i=0;i<strlen(isCheck);i++)
   {
       if(temp[i] == isCheck[i])
	      flag = 1;
       else
       {
	      flag = 0;
	      break;
       }
   }

   //Displaying Result
   
   if(flag == 0)
      printf("\n False");
   else
      printf("\n True");
   getch();
}
