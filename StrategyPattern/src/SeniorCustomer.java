
public class SeniorCustomer extends DecathalonCustomer {

	public SeniorCustomer(String name, int age) {
		super(name, age);
		dt=new DiscountType3();
	}
	
	public void display() {
		System.out.println("Hi Senior Customer");
		super.display();
	}
}
