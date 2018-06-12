
public class FirstCustomer extends Customer {

	
	public FirstCustomer(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void setDiscount(Discount d) {
		dt=d;
	}
	
	public void diaplay() {
		System.out.println("Hi First time user !");
		super.display();
	}

}
