
public class DiscountType3 extends DiscountType {
	
	double discount;
	double offAmt;
	double totAmt;


	public DiscountType3() {
		discount=0.10;
		offAmt=0.0;
	}

	@Override
	public void calculateBill(double mrp) {
		if(mrp>2000)
			offAmt=100;
		System.out.println("Senior citizen Customer Disc :"+discount+" and Off : "+offAmt);
		totAmt=(mrp)-(mrp*discount)-offAmt;
		System.out.println("Total Bill Amt : "+totAmt);

	}

}
