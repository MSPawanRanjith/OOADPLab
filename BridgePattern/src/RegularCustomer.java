
public class RegularCustomer extends Customer {

	public RegularCustomer(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void setDiscount(Discount d) {
		dt=d;
	}
	
	public void diaplay() {
		System.out.println("HI Regular user !");
		super.display();
	}

}
