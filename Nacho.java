
public class Nacho {
	
	private String flavor;
	private String size;
	private String price;
	
	public Nacho(String flavor, String size, String price) {
		super();
		this.flavor = flavor;
		this.size = size;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " \nFlavor : " + flavor + "\nSize: " + size + " \nPrice : " + price;
	}

}
