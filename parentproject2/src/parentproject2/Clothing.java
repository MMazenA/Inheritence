package parentproject2;

public class Clothing extends Product{
private String brand;
private String size;

public Clothing(String brand, String size) {
	super();
	this.setBrand(brand);
	this.setSize(size);
}
public Clothing() {
	super();
	this.setBrand("Champion");
	this.setSize("Medium");
		
}
public Clothing(double price, String company, String name, int quantity,String ok,String aa) {
	super(price, company, name, quantity);
	this.setBrand(ok);
	this.setSize(aa);
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

public String toString() {
	return (super.toString()+
			"\n\n---Clothing---\nBrand? :"+brand+
			"\nSize? :"+size+"\n");
}

}
