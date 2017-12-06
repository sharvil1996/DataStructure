#include<stdio.h>
#include<conio.h>
#include<String.h>
int countOccurrence(char str[],char subString[]);
void main()
{

   char str[100];
   char subString[100];
   int result = 0;
   clrscr();

   printf("\nEnter String :: ");
   gets(str);

   printf("\n Enter Sub String :: ");
   gets(subString);

   result = countOccurrence(str,subString);

   if(result)
      printf("\n YES");
   else
     printf("\n NO");
   getch();
}
int countOccurrence(char str[],char subString[])
{

   int i=0;
   int temp = 0,cnt = 0;;

   while(str[i] != '\0')
   {
       temp = strstr(str,subString);
       if(temp)
	 cnt++;
   }

   return cnt;

}