
public class FirstTimeCustomer extends DecathalonCustomer {

	public FirstTimeCustomer(String name, int age) {
		super(name, age);
		dt=new DiscountType1();
	}
	
	public void display() {
		System.out.println("Hello First Time Customer");
		super.display();
	}

}
