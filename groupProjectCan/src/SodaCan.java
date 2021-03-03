/**
 * This class holds data on a type of can.
 * 
 *  This class is only started, not finished

 * @version v1.0
 */

public class SodaCan {
		private String Company;
		private String Content;
		private double Size;
		private double Price;
		/**
		 * Default constructor
		 */

		public SodaCan() {
			
		}
		//This constructor sets all of the data of the can.
		//String Company1
		//String Content1
		//double Size1
		//double Price1
		public SodaCan(String Company1, String Content1, double Size1, double Price1)
		{
			Company = Company1;
			Content = Content1;
			Size = Size1;
			Price = Price1;
		}
		//This Constructor sets the company and content.
		//String Company1
		//String Content1
		public SodaCan(String Company1, String Content1) {

			Company = Company1;
			Content = Content1;
		}
		//This constructor sets the size and price
		//double Size1
		//double Price1
		public SodaCan(double Size1, double Price1) {
			Size = Size1;
			Price = Price1;
			
		}
		//Sets the company
		public void setCompany(String x)
		{
			Company = x;
		}
		//Gets the company
		public String getCompany()
		{
			return Company;
		}
		//Sets the content
		public void setContent(String x1)
		{
			Content = x1;
		}
		//Gets the content
		public String getContent()
		{
			return Content;
		}
		//Sets the size
		public void setSize(double x2)
		{
			Size = x2;
		}
		//Gets the size
		public double getSize()
		{
			return Size;
		}
		//Sets the price
		public void setPrice(double x3)
		{
			Price = x3;
		}
		//Gets the price
		public double getPrice()
		{
			return Price;
		}
		//Prints all of the data
		public void printAll() 
		{
			System.out.println("Can [Company="+Company+", Content="+Content+", Size="+Size+", Price="+Price);
		}
		
		}

