#include<stdio.h> //Standart input output header
#include<conio.h> //Concole input output header 

float genrateMedian(int arr[],int n);
float genrateMean(int arr[],int n);
int numberOfZeros(int arr[],int n);

void main()
{

   //Declaring Variable
   int arr[50];
   int n;
   int i=0;
   
   clrscr();
   
   printf("\nEnter size of array :: ");
   scanf("%d",&n); //Take Size of Array
   printf("\nEnter %d numbers :: ",n);

   for(i=0;i<n;i++)
      scanf("%d",&arr[i]); //Scan the numbers from user


   printf("\n Mean :: %f ",genrateMean(arr,n));   //Calling genrateMean Function
   printf("\n Median :: %f ",genrateMedian(arr,n));  //Calling genrateMedian Function
   printf("\n Number of Zeros :: %d",numberOfZeros(arr,n)); //Calling numberOfZeros Function
   
   getch();

}
int numberOfZeros(int arr[],int n)
{
   int i=0;
   int cnt=0;
   for(i=0;i<n;i++)
   {
      if(arr[i] == 0)
	 cnt++;
   }

   return cnt;
}
float genrateMean(int arr[],int n)
{
    int i=0;
    int total=0;
    for(i=0;i<n;i++)
      total += arr[i];



    return total/(float)n;
}
float genrateMedian(int arr[],int n)
{
	int i,j,temp;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

	if(n%2!=0)
	  return (float)arr[n/2];
	else
	  return (arr[n/2]+arr[n/2-1])/(float)2;
}