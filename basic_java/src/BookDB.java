import java.util.ArrayList;
import java.util.List;

public class BookDB {

	public List<Book> getAll() {
		List<Book> books = new ArrayList<>();
		books.add(new Book());
		books.add(new Book());
		books.add(new Book());
		books.add(new Book());
		books.add(new Book());
		return books;
	}

}
