
public class OnTheShelf implements State {
	
	NachoChips nacho;
	
	public OnTheShelf(NachoChips nacho)
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

		nacho.setState(nacho.getDeliverOrder());
	}
	public void deliverOrder()
	{
		System.out.println("Nacho Chips cannot be delivered yet");
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
		return "On the Shelf State";
	}

}
