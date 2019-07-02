import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class BookStoreTest {

	@Test
	public void list_of_book_should_return_5_books() {
		BookStore bookStore = new BookStore();
		List<Book> allBooks = bookStore.listAll();
		assertEquals(5, allBooks.size());
	}

}
