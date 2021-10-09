
public class AddInStock implements State {
	
NachoChips nacho;
	
	public AddInStock(NachoChips nacho)
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
	}
	public void addInStock()
	{
		System.out.println("Add more Stock");
	}
	
	
	public String toString() 
	{
		return "Add In Stock State";
	}

}
