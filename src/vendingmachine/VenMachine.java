package vendingmachine;

public interface VenMachine {
	void displayProducts();
	
	void selectProduct(int product);
	
	void displayEnterCoinsMessage();
	
	void enterrCoins(int[] coins);
	
	void displayChangeMessage();
	
}
