
public class DiscountType1 extends Discount {

	@Override
	public void calculateBill(double mrp) {
		
		double disc=0.3;
		double tot;
		System.out.println("Hi First time Customer us discount is "+disc);
		tot= mrp-(mrp*disc);
		System.out.println("Total Amt : "+tot);

	}

}
