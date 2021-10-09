
public class SoldOut implements State{
	
NachoChips nacho;
	
	public SoldOut(NachoChips nacho)
	{
		this.nacho = nacho;
		
	}
	
	public void takeOrder()
	{
		System.out.println("Order is taken");
	}
	
	public void ontheShelf()
	{
		System.out.println("Nacho chips are on the Shelf");

	}
	public void deliverOrder()
	{
		System.out.println("Nacho Chips are about to deliver");
	}
	public void soldOut()
	{
		System.out.println("NachoChips are Sold Out");
		nacho.setState(nacho.getAddInStock());
	}
	public void addInStock()
	{
		System.out.println("No need to add more NachoChips on shelf yet");
	}
	
	
	public String toString() 
	{
		return "Sold Out State";
	}

}
