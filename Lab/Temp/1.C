#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 
void main()
{
   //Declaring Variable
   int salary;
   float grossSalary;

   clrscr();

   printf("\nEnter basic Salary :: "); 
   scanf("%d",&salary); // Taking Salary as an input from User


   //Calculation

   grossSalary = salary + (salary*0.4) + (salary * 0.2);

   printf("\n Your Gross Salary is %f ",grossSalary); //Displaying Gross Salary

   getch();
}