import java.util.List;

public class BookStore {

	public List<Book> listAll() {
		BookDB db = new BookDB();
		List<Book> allBooks = db.getAll();
		return allBooks;
	}

}
