
public class SeniorCustomer extends Customer {

	public SeniorCustomer(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void setDiscount(Discount d) {
		dt=d;
	}
	
	public void display() {
		System.out.println("Hi Senior user !");
		super.display();
	}
}
