/** 
 * 
 * @author Dylan Hesser
 * program is used as a base for vacations that involve
 * being all inclusive or a la carte style
 *
 */
public abstract class Vacation 
	{
		private String destination;
		private double budget;

/**
 * default constructor
 */
		public Vacation () 
			{
				destination = null;
				budget = 0;
			}
/**
 * constructor that takes custom information
 * @param destination destination of vacation
 * @param budget money that can be used for vacation
 */
		public Vacation (String destination, double budget) 
			{
				this.destination = destination;
				this.budget = budget;
			}
/**
 * gets the destination variable
 * @return the destination variable
 */
public String getDestination()
	{
		return destination;
	}
/** 
 * gets the budget variable
 * @return the budget variable
 */
public double getBudget() 
	{
		return budget;
	}
/**
 * sets the destination to the custom one
 * @param destination the destination to be used
 */
public void setDestination(String destination) 
	{
		this.destination = destination;
	}
/**
 * sets the budget variable
 * @param budget the custom budget to be used
 */
public void setBudget(double budget) 
	{
		this.budget = budget;
	}
/**
 * abstract method to be used in the concrete classes
 * @return the budget after the price is taken out
 */
public abstract double budgetBalance() ;	
}

