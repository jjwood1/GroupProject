package Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class holds data on a type of can. 
 * @author Joshua Wood
 * @version v1.0
 */
@Entity 
@Table (name="cans")
public class Can {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="company")
	private String Company;
	@Column(name="contents")
	private String Content;
	@Column(name="price")
	private double Price;
	@Column(name="quantity")
	private int quantity;
		/**
		 * Default constructor
		 */

		public Can() {
			
		}
		//This constructor sets all of the data of the can.
		//String Company1
		//String Content1
		//double Size1
		//double Price1
		public Can(String Company1, String Content1, double Price1, int quantity)
		{
			Company = Company1;
			Content = Content1;
			this.quantity = quantity;
			Price = Price1;
		}
		public Can(String Company, String Content, double Price)
		{
			this.Company = Company;
			this.Content = Content;
			this.Price = Price;
		}
		//This Constructor sets the company and content.
		//String Company1
		//String Content1
		public Can(String Company1, String Content1) {

			Company = Company1;
			Content = Content1;
		}
		//This constructor sets the size and price
		//double Size1
		//double Price1
		public Can(double Price1) {
	
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

		//Gets the size

		//Sets the price
		public void setPrice(double x3)
		{
			Price = x3;
		}
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		public int getQuantity()
		{
			return quantity;
		}
		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id = id;
		}
		public void addCan(int quantity2)
		{
			quantity = quantity + quantity2;
		}
		//Gets the price
		public double getPrice()
		{
			return Price;
		}
		//Prints all of the data
		public void printAll() 
		{
			System.out.println("Can [Company="+Company+", Content="+Content+", Price="+Price);
		}
		
		}

