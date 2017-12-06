import java.util.Scanner;
public class main
{
	public static void main(String ... args)
	{
		Scanner scan=new Scanner(System.in);
		int ch=0;
		LinkedList pol1=new LinkedList();
		LinkedList pol2=new LinkedList();
		while(ch!=-1)
		{
				System.out.println("1. Add to polynomial 1");
				System.out.println("2. Reset polynomial 1");
				System.out.println("3. Display polynomial 1");
				System.out.println("4. Add to polynomial 2");
				System.out.println("5. Reset polynomial 2");
				System.out.println("6. Display polynomial 2");
				System.out.println("7. Add pol1 , pol2 and evaluate");
				System.out.println("8. Subtract pol2 , pol1");
				System.out.println("-1. Exit");
				System.out.print("Choice: ");
				ch=scan.nextInt();
				switch(ch)
				{
						case 1:
						{
							System.out.print("Enter Multiple: ");
							int mul=scan.nextInt();
							System.out.print("Enter power: ");
							int power=scan.nextInt();
							pol1.addAtLast(mul,power);
							break;
						}
						case 2:
						{
							pol1.reset();
							break;
						}
						case 3:
						{
							pol1.display();
							break;
						}
						case 4:
						{
							System.out.print("Enter Multiple: ");
							int mul=scan.nextInt();
							System.out.print("Enter power: ");
							int power=scan.nextInt();
							pol2.addAtLast(mul,power);
							break;
						}
						case 5:
						{
							pol2.reset();
							break;
						}
						case 6:
						{
							pol2.display();
							break;
						}
						case 7:
						{
							LinkedList sum=LinkedList.add(pol1,pol2);
							sum.display();
							System.out.print("Enter value: ");
							int ans=sum.evaluate(scan.nextInt());
							System.out.println("Answer: "+ans);
							break;
						}
						case 8:
						{
							LinkedList sum=LinkedList.subtract(pol2,pol1);
							sum.display();
							break;
						}
				}
		}
	}
}
