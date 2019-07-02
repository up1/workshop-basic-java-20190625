import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	private List<Item> items = new ArrayList<>();

	public int getAmount() {
		int amount = 0;
		for (Item item : items) {
			amount += item.getQuantity();
		}
		return amount;
	}

	public int getLineItems() {
		return items.size();
	}

	public void addBook(Book book) {
		// Check book is existing
		boolean notFound = true;
		for (Item item : items) {
			if(item.getName().equals(book.getName())) {
				// Found
				notFound = false;
				item.updateQuantity();
				break;
			}
		}
		
		if(notFound) {
			Item item = new Item(book, 1);
			items.add(item);
		}
	}

	public Item getItem(int position) {
		return items.get(position-1);
	}

}
