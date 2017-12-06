#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
   char isCheck[100];
   char temp[100];
   int i=0,len=0;
   int flag = 0;
   clrscr();
   printf("\nEnter String :: ");
   gets(isCheck);

   len = strlen(isCheck);
   while(isCheck[i]!='\0')
   {
      len--;
      temp[i] = isCheck[len];
      i++;
   }
   temp[i+1] = '\0';

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

   if(flag == 0)
      printf("\n False");
   else
      printf("\n True");
   getch();
}
