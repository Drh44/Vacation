/**
 * 
 * @author Dylan Hesser
 *program for a vacation where each part is priced individually
 */
public class ALaCarte extends Vacation
	{  
	//variables used for individual prices
		private String hotelName;
		private double roomCost;
		private String airLine;
		private double airFare;
		private double meals;
	/**
	 * default constructor
	 */
		public ALaCarte()
			{
				hotelName = "";
				roomCost = 0;
				airLine = "";
				airFare = 0;
				meals = 0;
			}
	    /**
	     * constructor to get custom input
	     * @param hotelName name of hotel
	     * @param roomCost cost of hotel
	     * @param airLine name of airline
	     * @param airFare cost of airline
	     * @param meals cost of meals 
	     */
		public ALaCarte(String hotelName, double roomCost, String airLine, double airFare, double meals)
			{
				this.hotelName = hotelName;
				this.roomCost = roomCost;
				this.airLine = airLine;
				this.airFare = airFare;
				this.meals = meals;
			}
		/**
		 *  gets hotel name
		 * @return returns name of hotel
		 */
		public String getHotelName()
			{
				return hotelName;
			}
		/**
		 * gets cost of room
		 * @return room cost
		 */
		public double getRoomCost()
			{
				return roomCost;
			}
		/**
		 * gets air line
		 * @return name of air line
		 */
		public String getAirLine()
			{
				return airLine;
			}
		/**
		 * gets air fare
		 * @return cost of air fare
		 */
		public double getAirFare()
			{
				return airFare;
			}
		/**
		 * gets meals
		 * @return cost of meals
		 */
		public double getMeals()
			{
				return meals;
			}
		/**
		 * set hotel name to input
		 * @param hotelName hotel name needed
		 */
		public void setHotelName(String hotelName) 
			{
				this.hotelName = hotelName;
			}
		/**
		 * sets room cost
		 * @param roomCost room cost needed
		 */
		public void setRoomCost(double roomCost)
			{
				this.roomCost = roomCost;
			}
		/**
		 * sets airline name
		 * @param airLine name to be used
		 */
		public void setAirLine(String airLine)
			{
				this.airLine = airLine;
			}
		/**
		 * sets cost of air fare
		 * @param airFare cost to be used
		 */
		public void setAirFare(double airFare)
			{
				this.airFare = airFare;
			}
		/**
		 * sets cost of meals
		 * @param meals cost to be used
		 */
		public void setMeals(double meals)
			{
				this.meals = meals;
			}
		/**
		 * overridden method to calculate the price and subtract it from the budget.
		 */
		public double budgetBalance() 
			{
				double remaining;
				double totalPrice = roomCost + airFare + meals;
				remaining = getBudget() - totalPrice;
				return remaining;
			}
	}
