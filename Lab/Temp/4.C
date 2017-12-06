#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header  
#include<string.h> //String header
void main()
{
   //Declaring Variable
   char str[100];
   char temp[100];
   int i=0,len=0,cnt=0;
   int flag = 0;
   
   clrscr();
   
   printf("\nEnter String :: "); //Take Input from user
   gets(str);

   len = strlen(str); //Count Length

   //Removing Extra Space,Symbol and Capital to lower Case
   
   for(i=0;i<len;i++)
   {
       if(str[i] > 96 && str[i] < 123 )
	      temp[cnt++] = str[i];
       else if(str[i] > 65 && str[i] < 90 )
	      temp[cnt++] = str[i]+32;

   }
   temp[i] = '\0';

   //Displaying Result
   
   printf("%s",temp);

   getch();
}
