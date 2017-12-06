
import java.util.*;
public class Q1{
	public static void main(String args[]){
		int choice=0;
		Scanner scanner = new Scanner(System.in);
		LinkList<Integer> linkList = new LinkList<Integer>();
		while(true){
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Display");
			System.out.println("4 - Reverse Display");
			System.out.println("5 - Exit");
			choice = scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println();
					System.out.println("1 - Insert at Begin");
					System.out.println("2 - Insert at Middle");
					System.out.println("3 - Insert at End");
					choice = scanner.nextInt();
					switch(choice){
						case 1:
							int no = scanner.nextInt();
							linkList.insertBegin(no);
							break;
						case 2:
								System.out.println("1 - By Position");
								System.out.println("2 - By After Value");
								System.out.println("3 - By Before Value");
								choice = scanner.nextInt();
								switch(choice){
									case 1:
											System.out.println("Enter Position :: ");
											int position = scanner.nextInt();
											no = scanner.nextInt();
											linkList.insertByPosition(no,position);
											break;
									case 2:
											System.out.println("Enter Number :: ");
											no = scanner.nextInt();
											System.out.println("Enter Number after that you want to insert :: ");
											int key = scanner.nextInt();
											System.out.println(linkList.insertByAfterValue(key,no)?no + " Inserted...!":"Element not found...!");
											break;
									case 3:
											System.out.println("Enter Number :: ");
											no = scanner.nextInt();
											System.out.println("Enter Number before that you want to insert :: ");
											key = scanner.nextInt();
											System.out.println(linkList.insertByBeforeValue(key,no)?no + " Inserted...!":"Element not found...!");
								}
								break;
						case 3:
								no = scanner.nextInt();
								linkList.insertLast(no);
								break;
					}
					break;
				case 2:
					System.out.println();
					System.out.println("1 - Delete at Begin");
					System.out.println("2 - Delete at Middle");
					System.out.println("3 - Delete at End");
					choice = scanner.nextInt();
					switch(choice){
						case 1:
							System.out.println(linkList.deleteBegin()?"Deleted" : "No nodes...!");
							break;
						case 2:
								System.out.println("1 - By Position");
								System.out.println("2 - By Value");
								choice = scanner.nextInt();
								switch(choice){
									case 1:
											int position = scanner.nextInt();
											System.out.println(linkList.deleteByPosition(position)?"":"Position not found...!");
											break;
									case 2:
											int data = scanner.nextInt();
											System.out.println(linkList.deleteByValue(data)?"":"Data not found...!");
											break;
								}
								break;
						case 3:
								linkList.deleteEnd();
								break;
					}
					break;
				case 3:
						linkList.displayNode();
						break;
				case 4:
						linkList.reverse();
						break;
				case 5:
					System.out.println("GOOD BYE...!");
					System.exit(0);
					break;
			}
		}
	}
}
