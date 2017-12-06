#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
int checkResult(int arr[],int n);

void main()
{

    //Declaring Variable
	
    int i=0;
    int result[10];
    int finalResult=0;
    
	clrscr();

    for(i=0;i<10;i++)
    {
       printf("\nEnter result(1=Pass,2=fail):");
       scanf("%d",&result[i]);  //Scan Student Result
    }

    finalResult = checkResult(result,10); //Call Function

	//Displaying Result

    if(finalResult)
      printf("\nYes");
    else
      printf("\nNo");

    getch();
}
int checkResult(int arr[],int n)
{
    int passed=0;
    int failed=0;
    int i=0;
    for(i=0;i<n;i++)
    {

	    if(arr[i] == 1)
	      passed++;
	    else if(arr[i] == 2)
	      failed++;

    }
    printf("\nPassed %d ",passed);
    printf("\nFailed %d ",failed);

    if(passed > 8)
      return 1;
    else
      return 0;
}