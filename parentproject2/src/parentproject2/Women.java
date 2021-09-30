package parentproject2;

public class Women extends Clothing{
	private boolean Earings;



	public Women(boolean Earings,int q) {
		super();
		this.Earings = Earings;
		this.setQuantity(q);
	}

	public Women() {
		super();
		this.Earings = true;
	}


	public boolean getEarings() {
		return Earings;
	}

	public void setEarings(boolean Earings) {
		this.Earings = Earings;
	}


	public String toString() {
		return (super.toString()+
				"\n---Women---\nWears Earings? :"+Earings+"\n");
	}
}
