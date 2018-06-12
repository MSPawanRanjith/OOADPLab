
public class Client {

	public static void main(String[] args) {
		
		double mrp=2500;
		
		DecathalonCustomer first=new FirstTimeCustomer("First", 12);
		first.display();
		first.calculateDiscount(mrp);
		
		DecathalonCustomer reg=new RegularCustomer("Regular", 30);
		reg.display();
		reg.calculateDiscount(mrp);
		
		DecathalonCustomer senior=new SeniorCustomer("Senior",60);
		senior.display();
		senior.calculateDiscount(mrp);
		
	}

}
