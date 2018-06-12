
public class DiscountType2 extends Discount {

	@Override
	public void calculateBill(double mrp) {
		double disc=0.25;
		double tot;
		System.out.println("Hi Regular time Customer us discount is "+disc);
		tot= mrp-(mrp*disc);
		System.out.println("Total Amt : "+tot);


	}

}
