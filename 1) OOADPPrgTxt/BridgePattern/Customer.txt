
public abstract class Customer {
	String name;
	int age;
	Discount dt;
	
	public Customer(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void calculateDiscount(double mrp){
		dt.calculateBill(mrp);
	}
	
	public abstract void setDiscount(Discount d);
	
	public void display(){
		System.out.println("NAME : "+name+"\nAge : "+age);
	}
}
