
public class DiscountType3 extends Discount {

	@Override
	public void calculateBill(double mrp) {
		
		double disc=0.20;
		double tot;
		System.out.println("Hi Senior time Customer us discount is "+disc);
		tot= mrp-(mrp*disc);
		System.out.println("Total Amt : "+tot);


	}

}
