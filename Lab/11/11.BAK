#include<stdio.h>
#include<conio.h>
void characterOccurrence(char str[]);
void main()
{
   char str[100];

   clrscr();

   printf("\nEnter a string :: ");
   gets(str);

   characterOccurrence(str);

   getch();
}

void characterOccurrence(char str[])
{
   int i=0,temp;
   int character[26];

   for(i=0;i<26;i++)
      character[i]=0;

   for(i=0;i<strlen(str);i++)
   {
      temp = str[i]-97;
      character[temp]++;
   }

   for(i=0;i<26;i++)
   {
      if(character[i]>0)
	printf("\n %c %d ",(char)i+97,character[i]);
   }
}

