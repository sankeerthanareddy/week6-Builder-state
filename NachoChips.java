
public class NachoChips {
	
	
	State ontheshelf;
	State addinstock;
	State soldout;
	State takeorder;
	State deliverorder;
	
	State state;
	
	public NachoChips()
	{
		ontheshelf = new OnTheShelf(this);
		addinstock = new AddInStock(this);
		soldout = new SoldOut(this);
		takeorder = new TakeOrder(this);
		deliverorder = new DeliverOrder(this);
		
		state = takeorder;
		
	}
	
	public void ontheShelf()
	{
		state.ontheShelf();
	}
	public void soldOut()
	{
		state.soldOut();
	}
	
	public void addInStock()
	{
		state.addInStock();;
	}
	
	public void takeOrder()
	{
		state.takeOrder();;
	}
	public void deliverOrder()
	{
		state.deliverOrder();
	}
	
	
	
	
	void setState(State state) 
	{
		this.state = state;
	}
	public State getState() 
	{
        return state;
    }

    public State getOntheShelf() 
    {
        return ontheshelf;
    }

    public State getSoldOut() 
    {
        return soldout;
    }
    public State getAddInStock() 
    {
        return addinstock;
    }
    
    public State getTakeOrder() 
    {
        return takeorder;
    }
    
    public State getDeliverOrder() 
    {
        return deliverorder;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\n========== NachoChips Store =============");
		
		
		result.append("\n");
		result.append("NachoChips are in " + state + "\n");
		return result.toString();
	}
	

}


