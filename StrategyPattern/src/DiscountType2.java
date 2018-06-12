
public class DiscountType2 extends DiscountType {
	
	double discount;
	double offAmt;
	double totAmt;

	public DiscountType2() {
		discount=0.12;
		offAmt=0.0;
	}

	@Override
	public void calculateBill(double mrp) {
		if(mrp>2000)
			offAmt=100;
		System.out.println("Regular Customer Disc :"+discount+" and Off : "+offAmt);
		totAmt=(mrp)-(mrp*discount)-offAmt;
		System.out.println("Total Bill Amt : "+totAmt);
	}

}
