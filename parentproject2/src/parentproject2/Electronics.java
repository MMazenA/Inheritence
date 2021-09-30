package parentproject2;

public class Electronics extends Product{


private boolean onoff;
private boolean batteryIncluded;

public Electronics(double price, String company, String name, int quantity) {
	super(price, company, name, quantity);
}

public Electronics() {
	super(800,"Apple","Iphone 20",3);
	this.onoff=true;
	this.batteryIncluded=true;
}
public boolean getOnoff() {
	return onoff;
}
public void setOnoff(boolean onoff) {
	this.onoff = onoff;
}

public boolean getBatteryIncluded() {
	return batteryIncluded;
}
public void setBatteryIncluded(boolean batteryIncluded) {
	this.batteryIncluded = batteryIncluded;
}

public String toString() {
	
	return (super.toString()+
			"\n\n---Electronics---\nIs the electronic on :"+onoff+"\n"+
			"Is the Battery included :"+batteryIncluded+"\n");
	
}
}
