#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
#include<string.h> //String header
void main()
{
   //Declaring Variable
   
   char str[50],substr[25],temp[10];
   int i=0,j;
   int cnt=0,occurrence=1,strLength=0,substrLength=0;
   
   clrscr();

   printf("Enter String : ");
   gets(str);  //Get String 1
   printf("Enter SubString : ");
   gets(substr);
   
   //Count length of two String
   strLength=strlen(str);                            
   substrLength=strlen(substr);
   
   //Calculation
   
   for(i=0,j=0;i<strLength-substrLength;i++)
   {
      for(cnt=i,j=0;j<substrLength;j++,cnt++)
	    temp[j]=str[cnt];
      temp[j]=0;
      if(!strcmp(temp,substr))
       occurrence++;
   }
   
   //Display Result
   
   printf("Character %s occurs %d times",substr,occurrence);
   
   getch();
}