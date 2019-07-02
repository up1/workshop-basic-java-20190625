import java.util.List;

public class BookStore {
	
	private BookDB db;
	
	public void setDb(BookDB db) {
		this.db = db;
	}

	public List<Book> listAll() {
		List<Book> allBooks = db.getAll();
		return allBooks;
	}

}
