#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int checkCharacter(char ch);
void main()
{

     char ch;
    int characterResult=0;
    clrscr();

    printf("\nEnter Character :: ");
    scanf("%c",&ch);


    characterResult = checkCharacter(ch);

    if(characterResult)
      printf("\nVowel");
    else
      printf("\nConsonant");

    getch();
}
int checkCharacter(char ch)
{

    ch = toupper(ch);
    switch(ch)
    {
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	   return 1;
	default:
	   return 0;
    }
}