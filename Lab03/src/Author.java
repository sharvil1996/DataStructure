import java.util.ArrayList;

class Author {

	private String name;
	private int cnt = 0;
	private ArrayList<Book> arrayListOfBook = new ArrayList<>();

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getArrayListOfBook() {
		return arrayListOfBook;
	}

	public void setName(String name) {
		this.name = name;
	}

	String addBook(Book book) {
		cnt++;
		if (cnt == 3)
			return "You can not add 9 ";
		else {
			arrayListOfBook.add(book);
			return "Added Successfuully...!!";
		}
	}

}
