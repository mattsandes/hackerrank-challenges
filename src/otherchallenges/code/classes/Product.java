package otherchallenges.code.classes;

public class Product {
	
	private String name;
	private double price;
	private int amount;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double setTotalValueAmount() {
		var valueByAmount = (double) amount * price;
		
		return valueByAmount;
	}
	
	public String isAvailable() {
		boolean productAvailability;
		
		if(amount != 0) {
			productAvailability = true;
			
			return String.format("%s is avaliable", getName());
			
		}
		
		else if(amount == 0) {
			productAvailability = false;
			
			return String.format("%s is not available", getName());
		}
		
		return null;
	}
}
