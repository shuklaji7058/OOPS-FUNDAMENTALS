package CoreJava;

public class Nonstatic_Variable {
	public static void main(String[] args) {
		Deliveryboy d1 = new Deliveryboy();
		
		d1.did=1;
		d1.dname="Shubham";
		d1.dphone=9876543222l;
		
		System.out.println("DeliveryBoy is: ");
		System.out.println(d1.did);
		System.out.println(d1.dname);
		System.out.println(d1.dphone);
//------------------------------------------------------------------		
		Product p1 = new Product();
		
		p1.pname="Bat";
		p1.price=2000;
		p1.pquality="Kashmiri willow";
		
		System.out.println("Product is: ");
		System.out.println(p1.pname);
		System.out.println(p1.price);
		System.out.println(p1.pquality);
//------------------------------------------------------------------		
		Seller s1 = new Seller();
		s1.sname="Anish";
		s1.sid=2;
		s1.sphone=9536962233l;
		
		System.out.println("Seller is: ");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.sphone);
//-------------------------------------------------------------------		
		Buyer b1 = new Buyer();
		b1.bid=4;
		b1.bname="Tulsi";
		b1.bphone=7366298453l;
		
		System.out.println("Buyer is: ");
		System.out.println(b1.bid);
		System.out.println(b1.bname);
		System.out.println(b1.bphone);
	}
	
}
