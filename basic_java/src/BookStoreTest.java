import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BookStoreTest {
	
	@Test
	public void list_of_book_should_return_5_books() {
		BookStore bookStore = new BookStore();
		bookStore.setDb(new BookDB() {
			
			@Override
			public List<Book> getAll() {
				List<Book> books = new ArrayList<>();
				books.add(new Book());
				books.add(new Book());
				books.add(new Book());
				books.add(new Book());
				books.add(new Book());
				return books;
			}
		});
		List<Book> allBooks = bookStore.listAll();
		assertEquals(5, allBooks.size());
	}

	private final class XXX implements BookDB {
		@Override
		public List<Book> getAll() {
			List<Book> books = new ArrayList<>();
			books.add(new Book("Harry Potter 1", 8, 10));
			return books;
		}
	}
	
	@Test
	public void detail_of_first_book() {
		BookStore bookStore = new BookStore();
		bookStore.setDb(new XXX());
		List<Book> allBooks = bookStore.listAll();
		assertEquals("Harry Potter 1", allBooks.get(0).getName());
		assertEquals(8, allBooks.get(0).getPrice());
		assertEquals(10, allBooks.get(0).getStock());
	}


}
