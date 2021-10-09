
public class DeliverOrder implements State {
	
NachoChips nacho;
	
	public DeliverOrder(NachoChips nacho)
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
		nacho.setState(nacho.getSoldOut());
	}
	public void soldOut()
	{
		System.out.println("NachoChips are not sold yet");
	}
	public void addInStock()
	{
		System.out.println("No need to add more NachoChips on shelf yet");
	}
	
	
	public String toString() 
	{
		return "Deliver Order State";
	}
}
