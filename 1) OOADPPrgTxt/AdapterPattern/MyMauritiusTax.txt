
public class MyMauritiusTax extends CalcTax {
	
	double taxAmt=0.0;
	MauriTax mt=new MauriTax();
	@Override
	public double getTaxAmt() {
		return mt.taxCalc();
	}

}
