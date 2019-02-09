/**
 * 
 * @author Dylan Hesser
 *This program will take a vacation that is one total price and tell you if its over or under budget
 */
public class AllInclusive extends Vacation 
	{
	//variables used only for this program
		private	String brand;
		private int rating;
		private	double price;
/**
 * default constructor	
 */
		public AllInclusive() 
			{
				brand = null;
				rating = 0;
				price = 0;
			}
/**
 * constructor to allow custom information		
 * @param brand brand to be used
 * @param rating rating to be used
 * @param price price to be used
 */
		public AllInclusive(String brand, int rating, double price) 
   			{
	   			this.brand = brand; 
	   			this.rating = rating;
	   			this.price = price;
   			}
/**
 * gets the brand 
 * @return brand to be shown
 */
		public String getBrand()
			{
				return brand;
			}
/**
 * gets the rating   
 * @return rating to be shown
 */
		public int getRating()
			{
				return rating;
			}
/**
 * gets the price   
 * @return price to be shown
 */
		public double getPrice()
			{
				return price;
			}
/**
 * sets the brand variable to new information   
 * @param brand brand to be used
 */
		public void setBrand(String brand)
			{
				this.brand = brand;
			}
/**
 * sets the rating variable to new information   
 * @param rating rating to be used
 */
		public void setRating(int rating)
			{
				this.rating = rating;
			}
/**
 * sets the price variable to new information   
 * @param price price to be used
 */
		public void setPrice(double price)
   			{
	   			this.price = price;
   			}
/**
 * overrides the abstract method for this class. takes the budget and subtracts the price   
 */
		public double budgetBalance() 
			{
				double remaining = 0;
				remaining = getBudget() - price;
				return remaining;
			}   
}
