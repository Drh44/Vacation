import java.util.ArrayList;
/**
 * 
 * @author Dylan Hesser
 *tester for vacation class
 */
public class VacationTester 
	{
		public static void main(String[] args) 
			{//variables to be set and used
				String brand = "";
				int rating = 0;
				double price = 0;
				String hotelName = "";
				double hotelCost = 0;
				String airLine = "";
				double airFare = 0;
				double meals = 0;
				int i = 0;
		        ArrayList<Vacation> vacationBudget = new ArrayList<Vacation>();
				System.out.println("Hello this program will determine if your vacation is over or under budget! \n");
		
				AllInclusive vacation1 = new AllInclusive (brand, rating, price);
				vacation1.setBudget(7900);
				vacation1.setDestination("Paris");
				vacation1.setBrand("Bravado");
				vacation1.setRating(3);
				vacation1.setPrice(5000);
				System.out.println("You have a budget of " + vacation1.getBudget());
				System.out.println("Your price issued by " + vacation1.getBrand() + ", which has a rating of " + vacation1.getRating() + ", is " + vacation1.getPrice());
				System.out.println("Your vacation at " + vacation1.getDestination() + " has " + vacation1.budgetBalance() + " left of your planned budget \n");
		        vacationBudget.add(vacation1);
				
				AllInclusive vacation2 = new AllInclusive (brand, rating, price);
				vacation2.setBudget(6000);
				vacation2.setDestination("Paris");
				vacation2.setBrand("Bravado");
				vacation2.setRating(5);
				vacation2.setPrice(8000);
				System.out.println("You have a budget of " + vacation2.getBudget());
				System.out.println("Your price issued by " + vacation2.getBrand() + ", which has a rating of " + vacation2.getRating() + ", is " + vacation2.getPrice());
				System.out.println("Your vacation at " + vacation2.getDestination() + " has " + vacation2.budgetBalance() + " left of your planned budget \n");
				vacationBudget.add(vacation2);
				
				ALaCarte vacation3 = new ALaCarte(hotelName, hotelCost, airLine, airFare, meals );
				vacation3.setBudget(2000);
				vacation3.setDestination("Washington DC");
				vacation3.setHotelName("Blue Inn Hotel");
		        vacation3.setRoomCost(300);
		        vacation3.setAirLine("UnUnited Airlines");
		        vacation3.setAirFare(1000);
		        vacation3.setMeals(400);
		        System.out.println("Your vacation to " + vacation3.getDestination() + " has a budget of " + vacation3.getBudget());
		        System.out.println("Your room at the hotel " + vacation3.getHotelName() + " will cost " + vacation3.getRoomCost());
		        System.out.println("Your plane ride is with " + vacation3.getAirLine() + " and will cost " + vacation3.getAirFare());
		        System.out.println("Meals will cost you " + vacation3.getMeals());
		        System.out.println("Your vacation at " + vacation3.getDestination() + " has " + vacation3.budgetBalance() + " left of your planned budget \n");
		        vacationBudget.add(vacation3);
		        
		        ALaCarte vacation4 = new ALaCarte(hotelName, hotelCost, airLine, airFare, meals );
				vacation4.setBudget(5000);
				vacation4.setDestination("South Pole");
				vacation4.setHotelName("Chills Inn");
		        vacation4.setRoomCost(1000);
		        vacation4.setAirLine("Santa's Sleigh");
		        vacation4.setAirFare(4000);
		        vacation4.setMeals(400);
		        System.out.println("Your vacation to " + vacation4.getDestination() + " has a budget of " + vacation4.getBudget());
		        System.out.println("Your room at the hotel " + vacation4.getHotelName() + " will cost " + vacation4.getRoomCost());
		        System.out.println("Your plane ride is with " + vacation4.getAirLine() + " and will cost " + vacation4.getAirFare());
		        System.out.println("Meals will cost you " + vacation4.getMeals());
		        System.out.println("Your vacation at " + vacation4.getDestination() + " has " + vacation4.budgetBalance() + " left of your planned budget \n");
		        vacationBudget.add(vacation4);
		        
		        for (i = 0; i < vacationBudget.size(); i++) 
		        	{
		        		if ( vacationBudget.get(i).budgetBalance() < 0) 
		        			{
		        				System.out.println("You have gone over budget on vacation to " + vacationBudget.get(i).getDestination() + "!");
		        			}
		        		else 
		        			{
		        				System.out.println("You are under budget on vacation to " + vacationBudget.get(i).getDestination() + "!");
		        			}
		        	}
		        
		   
	
			}
}
