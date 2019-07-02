import static org.junit.Assert.*;

import org.junit.Test;

public class BookStoreWithAddBookTest {

	@Test
	public void add_first_book_to_basket() {
		BookStore bookStore = new BookStore();
		Book firstBook = new Book("Harry Potter 1", 8, 10);
		bookStore.pickItem(firstBook);
		Basket basket = bookStore.getCurrentBasket();
		assertEquals(1, basket.getAmount());
		assertEquals(1, basket.getLineItems());
	}
	
	@Test
	public void add_2_first__book_to_basket() {
		BookStore bookStore = new BookStore();
		Book firstBook1 = new Book("Harry Potter 1", 8, 10);
		Book firstBook2 = new Book("Harry Potter 1", 8, 10);
		bookStore.pickItem(firstBook1);
		bookStore.pickItem(firstBook2);
		Basket basket = bookStore.getCurrentBasket();
		assertEquals(2, basket.getAmount());
		assertEquals(1, basket.getLineItems());
	}
	
	@Test
	public void add_2_first_book_and_1_second_book_to_basket() {
		BookStore bookStore = new BookStore();
		Book firstBook1 = new Book("Harry Potter 1", 8, 10);
		Book firstBook2 = new Book("Harry Potter 1", 8, 10);
		Book secondBook1 = new Book("Harry Potter 2", 8, 10);
		bookStore.pickItem(firstBook1);
		bookStore.pickItem(firstBook2);
		bookStore.pickItem(secondBook1);
		Basket basket = bookStore.getCurrentBasket();
		assertEquals(3, basket.getAmount());
		assertEquals(2, basket.getLineItems());
	}

}
