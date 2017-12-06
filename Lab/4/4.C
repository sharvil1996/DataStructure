#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
   char str[100];
   char temp[100];
   int i=0,len=0,cnt=0;
   int flag = 0;
   clrscr();
   printf("\nEnter String :: ");
   gets(str);

   len = strlen(str);

   for(i=0;i<len;i++)
   {
       if(str[i] > 96 && str[i] < 123 )
	  temp[cnt++] = str[i];
       else if(str[i] > 65 && str[i] < 90 )
	  temp[cnt++] = str[i]+32;

   }
   temp[i] = '\0';

   printf("%s",temp);

   getch();
}
