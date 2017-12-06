#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
void characterOccurrence(char str[]);
void main()
{
   //Declaring Variable	
	
   char str[100];

   clrscr();

   printf("\nEnter a string :: ");
   gets(str);  //Get a string from user

   characterOccurrence(str);  // Calling function

   getch();
}

void characterOccurrence(char str[])
{
   int i=0,temp;
   int character[26];

   //Initilze all value of array as 0
   for(i=0;i<26;i++)
      character[i]=0;

   //Calculation 
   
   for(i=0;i<strlen(str);i++)
   {
      temp = str[i]-97;
      character[temp]++;
   }

   //Displaying Result
   
   for(i=0;i<26;i++)
   {
      if(character[i]>0)
   	    printf("\n %c %d ",(char)i+97,character[i]);
   }
}

