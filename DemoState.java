
public class DemoState {

	public static void main(String[] args) 
	{
		
		
		Nacho Salty = new NachoBuilder().setFlavor("Salty").setSize("Large").setPrice("$2").getNacho();
		Nacho Pepper = new NachoBuilder().setFlavor("Salt & Pepper").setSize("Medium").setPrice("$1").getNacho();
		Nacho Cheese = new NachoBuilder().setFlavor("Cheese").setSize("Small").setPrice("$0.5").getNacho();
		
		
		System.out.println("Salty Nacho Chip : "+Salty);
		System.out.println("Pepper Nacho Chip :  "+Pepper);
		System.out.println("Cheese Nacho Chip : "+Cheese);
		
		
		
		
		NachoChips nacho = new NachoChips();
		
		System.out.println(nacho);
		nacho.takeOrder();
		System.out.println(nacho);
		nacho.ontheShelf();
		System.out.println(nacho);
		nacho.deliverOrder();
		System.out.println(nacho);
		nacho.soldOut();
		System.out.println(nacho);
		nacho.addInStock();
		
		
		
		
		
	
		
		
	}

}
