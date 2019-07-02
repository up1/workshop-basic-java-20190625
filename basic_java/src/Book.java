public class Book {

	private String name;
	private int price;
	private int stock;
	
	public Book() {
	}
	public Book(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
}
