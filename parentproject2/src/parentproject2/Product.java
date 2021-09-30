package parentproject2;

public class Product {
	private double price;
	private String company;
	private String name;
	private int quantity;
	
	public Product() {
		this.price = 5;
		this.company = "stockX";
		this.name = "Shoes";
		this.quantity = 75;
	}
	
	public Product(double price, String company, String name, int quantity) {
		this.price = price;
		this.company = company;
		this.name = name;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public String toString() {
		
		return ("Price : $"+price+"\n"+
				"Company : "+company+"\n"+
				"Name : "+name+"\n"+
				"Quantity : "+quantity);
		
	}
}
