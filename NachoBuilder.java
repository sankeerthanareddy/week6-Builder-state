
public class NachoBuilder {
	
	private String flavor;
	private String size;
	private String price;
	
	
	public NachoBuilder setFlavor(String flavor) {
		this.flavor = flavor;
		return this;
	}
	public NachoBuilder setSize(String size) {
		this.size = size;
		return this;
	}
	public NachoBuilder setPrice(String price) {
		this.price = price;
		return this;
	}
	
	public Nacho getNacho() {
		return new Nacho(flavor, size, price);
	}

}
