
public class TakeOrder implements State {
	
NachoChips nacho;
	
	public TakeOrder(NachoChips nacho)
	{
		this.nacho = nacho;
		
	}
	
	public void takeOrder()
	{
		System.out.println("Order is taken");
		nacho.setState(nacho.getOntheShelf());
	}
	
	public void ontheShelf()
	{
		System.out.println("Nacho chips are on the Shelf are not Checked yet");
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
		return "Take Order State";
	}
}