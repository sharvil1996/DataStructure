import java.util.ArrayList;

public class Book {

	private String title;
	private ArrayList<Author> arrayListOfAuthor = new ArrayList<>();
	private ArrayList<Reader> arrayListOfReader = new ArrayList<>();

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Author> getArrayListOfAuthor() {
		return arrayListOfAuthor;
	}

	public ArrayList<Reader> getArrayListOfReader() {
		return arrayListOfReader;
	}

	public void addReader(Reader reader) {
		arrayListOfReader.add(reader);
	}

	public void addAuthor(Author author) {
		arrayListOfAuthor.add(author);
	}
}
