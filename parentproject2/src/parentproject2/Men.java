package parentproject2;

public class Men extends Clothing{
private boolean glasses;



public Men(boolean glasses,int q) {
	super();
	this.glasses = glasses;
	this.setQuantity(q);

}

public Men() {
	super();
	this.glasses = true;
}


public Men(String brand, String size, boolean glasses) {
	super(brand, size);
	this.glasses = glasses;
}

public boolean getglasses() {
	return glasses;
}

public void setglasses(boolean glasses) {
	this.glasses = glasses;
}


public String toString() {
	return (super.toString()+
			"\n---Men---\nWears Glasses? :"+glasses+"\n");
}


}
