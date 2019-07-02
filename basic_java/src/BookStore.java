import java.util.List;

public class BookStore {
	
	private BookDB db;
	private Basket basket = new Basket();
	
	public void setDb(BookDB db) {
		this.db = db;
	}

	public List<Book> listAll() {
		List<Book> allBooks = db.getAll();
		return allBooks;
	}

	public void pickItem(Book book) {
		basket.addBook(book);
	}

	public Basket getCurrentBasket() {
		return basket;
	}

}
