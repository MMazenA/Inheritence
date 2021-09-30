package parentproject2;

public class Media extends Product{
private String type;

public Media() {
	super();
	this.type = "Movie";
}
public Media(double price, String company, String name, int quantity,String type) {
	super(price, company, name, quantity);
	this.type = type;

}

public Media(String type,int q) {
	super();
	this.type = type;
	this.setQuantity(q);
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String toString() {
	
	return (super.toString()+
			"\n\n---Media---\nWhat kind of media is this :"+type+"\n");
	
}

}
