import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		ArrayList<Author> arrayListOfAuthor = new ArrayList<>();
		ArrayList<Reader> arrayListOfReader = new ArrayList<>();
		ArrayList<Book> arrayListOfBook = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println();
			System.out.println("1 - Add Author");
			System.out.println("2 - Add Book");
			System.out.println("3 - Add Reader");
			System.out.println("4 - Detail a Author");
			System.out.println("5 - Detail a book");
			System.out.println("6 - Detail a reader");
			System.out.println("7 - Display all book");
			System.out.println("8 - Display all author");
			System.out.println("9 - Display all reader");
			System.out.println("10 - Exit");

			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("Enter a Name::");
				String name = sc.next();
				Author author = new Author(name);
				arrayListOfAuthor.add(author);
				break;
			case 2:
				System.out.println();
				System.out.println("Enter a title::");
				String title = sc.next();
				Book book = new Book(title);
				int cnt = 1;
				for (Author author1 : arrayListOfAuthor) {
					System.out.println(cnt++ + " " + author1.getName());
				}
				System.out.println("Select a author who has written this book :: ");
				int ch = sc.nextInt();
				try {
					Author temp = arrayListOfAuthor.get(ch - 1);
					book.addAuthor(temp);
					temp.addBook(book);
					arrayListOfBook.add(book);
				} catch (Exception e) {
					System.out.println("Invalid Selecton...!");
				}

				break;
			case 3:
				System.out.println();
				System.out.println("Enter a Reader Name ::");
				name = sc.next();
				Reader reader = new Reader(name);
				cnt = 1;
				System.out.println("Select Your Book for reading :: ");
				for (Book book1 : arrayListOfBook) {
					System.out.println(cnt++ + " " + book1.getTitle());
				}
				ch = sc.nextInt();
				try {
					Book temp = arrayListOfBook.get(ch - 1);
					reader.addReader(temp);
					temp.addReader(reader);
					arrayListOfReader.add(reader);
				} catch (Exception e) {
					System.out.println("Invalid Selecton...!");
				}
				break;
			case 4:

				System.out.println();
				System.out.println("List of Authors :: ");
				cnt = 1;
				for (Author author2 : arrayListOfAuthor) {
					System.out.println(cnt++ + " : " + author2.getName());
				}
				System.out.print("Select Your Author for get Detail :: ");
				ch = sc.nextInt();
				Author temp1 = arrayListOfAuthor.get(ch - 1);
				System.out.println("Author Name " + temp1.getName());
				for (Book book2 : temp1.getArrayListOfBook()) {
					System.out.println("Book Name " + book2.getTitle());
				}
				break;
			case 5:
				System.out.println();
				System.out.println("List of Book :: ");
				cnt = 1;
				for (Book book2 : arrayListOfBook) {
					System.out.println(cnt++ + " : " + book2.getTitle());
				}
				System.out.print("Select Your Book for get Detail :: ");
				ch = sc.nextInt();
				Book book2 = arrayListOfBook.get(ch - 1);
				System.out.println("Book Name " + book2.getTitle());
				for (Author a : book2.getArrayListOfAuthor()) {
					System.out.println("Author Name " + a.getName());
				}
				for (Reader r : book2.getArrayListOfReader()) {
					System.out.println("Reader Name " + r.getName());
				}
				break;
			case 6:
				System.out.println();
				System.out.println("List of Reader :: ");
				cnt = 1;
				for (Reader reader3 : arrayListOfReader) {
					System.out.println(cnt++ + " : " + reader3.getName());
				}
				System.out.print("Select Your Reader for get Detail :: ");
				ch = sc.nextInt();
				Reader reader4 = arrayListOfReader.get(ch - 1);
				System.out.println("Reader Name " + reader4.getName());
				for (Book a : reader4.getArrayListOfBook()) {
					System.out.println("Book Name " + a.getTitle());
				}
				break;
			case 7:
				System.out.println();
				System.out.println("List of Book:: ");
				cnt = 1;
				for (Book book3 : arrayListOfBook) {
					System.out.println(cnt++ + " : " + book3.getTitle());
				}
				break;
			case 8:
				System.out.println();
				System.out.println("List of Authors :: ");
				cnt = 1;
				for (Author author2 : arrayListOfAuthor) {
					System.out.println(cnt++ + " : " + author2.getName());
				}
				break;
			case 9:
				System.out.println();
				System.out.println("List of Reader:: ");
				cnt = 1;
				for (Reader reader2 : arrayListOfReader) {
					System.out.println(cnt++ + " : " + reader2.getName());
				}
				break;
			case 10:
				System.out.println("GOOD BYE...!");
				break;
			default:
				break;
			}
		} while (choice != 9);
	}
}
