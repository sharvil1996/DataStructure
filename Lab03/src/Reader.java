import java.util.ArrayList;

class Reader {

	private ArrayList<Book> arrayListOfBook = new ArrayList<>();
	private String name;

	public Reader() {
		// TODO Auto-generated constructor stub
	}

	public Reader(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getArrayListOfBook() {
		return arrayListOfBook;
	}

	public void addReader(Book book) {
		arrayListOfBook.add(book);
	}
}
