#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
#include<ctype.h> //Character type header
int checkCharacter(char ch);
void main()
{

    //Declaring Variable
    
	char ch;
    int characterResult=0;
    
	clrscr();

    printf("\nEnter Character :: ");
    scanf("%c",&ch);  //Take one character from user


    characterResult = checkCharacter(ch); //Call function

	//Show Result
	
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