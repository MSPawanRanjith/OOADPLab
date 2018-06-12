
public class Client {
	
	public static void main(String[] args) {
		
		CalcTax ct=new SwedenTax();
		Item item=new Item("Byclce", 1000.0, ct);
		item.setQty(4);
		item.printBill();
		
		System.out.println("Now same bill with Mauri Tax");
		item.setTax(new MyMauritiusTax());
		item.printBill();
		
	}
}
