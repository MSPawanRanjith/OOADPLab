
public class DecathalonCustomer {
	String name;
	int age;
	DiscountType dt;
	
	public DecathalonCustomer(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void calculateDiscount(double mrp) {
		dt.calculateBill(mrp);
	}
	public  void display() {
		System.out.println("Customer Details");
		System.out.println("Name : "+name+"\nAge : "+age);
	}
}
