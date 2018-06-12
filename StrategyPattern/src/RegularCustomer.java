
public class RegularCustomer extends DecathalonCustomer {

	
	public RegularCustomer(String name, int age) {
		super(name, age);
		dt=new DiscountType2();
	}
	
	public void  display() {
		System.out.println("Hi Regular Customer");
		super.display();
	}

}
