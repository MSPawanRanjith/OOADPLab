
public class Client {

	public static void main(String[] args) {
		
		Customer customer;
		double mrp=100;
		
		customer=new FirstCustomer("First", 24);
		customer.setDiscount(new DiscountType1());
		customer.calculateDiscount(mrp);
		
		customer=new FirstCustomer("Second", 34);
		customer.setDiscount(new DiscountType3());
		customer.calculateDiscount(mrp);
		
		customer=new FirstCustomer("Senior", 60);
		customer.setDiscount(new DiscountType2());
		customer.calculateDiscount(mrp);
		
	}

}
