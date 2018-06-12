
public class Item {
	
	String 	name;
	double 	price;
	int 	qty;
	double  totAmt;
	
	CalcTax ct;
	
	public Item(String name,double price,CalcTax ct) {
		this.name=name;
		this.price=price;
		this.ct=ct;
	}
	
	public void setQty(int qty){
		this.qty=qty;
	}
	
	public void setTax(CalcTax ct){
		this.ct=ct;
	}
	
	public void printBill(){
		double tax=ct.getTaxAmt()*qty*price;
		totAmt=price*qty+tax;
		System.out.println("BILL");
		System.out.println("Product : "+name+"\nCost : "+price+"\nQty : "+qty+"\nTotal Tax : "+tax+"\nGrand Total : "+totAmt);
	}
	

}
