#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
#include<string.h> //String header
void fibo(int p);
void prime(int n);
int power(int x,int y);
void main()
{
   //Declaring Variable
   char str[100],str1[100];
   int pow=0;

   clrscr();
   printf("\nEnter String :: ");
   gets(str); //Get String from user
   printf("\nEnter String :: ");
   gets(str1); //Get String from user

   printf("\n Reverse String is %s",strrev(str)); //Reverse String

   pow = power(strlen(str),strlen(str1));  //Calculate power 
   

   if(!strcmp(str,str1))
   {
      printf("\n GOOGLE");
      printf("\n %d ",pow);
      prime(pow);  //Calculate Prime
   }
   else
   {
      printf("\n YAHOO");
      printf("\n %d",pow);
      fibo(pow); //Calculate Fibo
   }
   getch();

}
void fibo(int n)
{
   int i=0,j=1;
   printf("\nFibonacci Series:: ");

   while(i<n)
   {
	printf("%d %d ",i,j);
	i=i+j;
	j=i+j;
   }
}
void prime(int n)
{
   int i,j,flag=0;
   printf("\n Prime numbers :: ");
   for(i=2;i<n;i++)
   {
	flag=0;
	for(j=1;j<=i;j++)
	{
	  if(i%j==0)
	     flag++;
	}
	if(flag==2)
	  printf("\n %d ",i);
   }


}
int power(int x,int y)
{
  if(y==0)
     return 1;
  else
     return x*power(x,y-1);
}