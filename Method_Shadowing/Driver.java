package Method_Shadowing;

public class Driver {
		
		public static void main(String[] args) {
			//Method Shadowing
			Animal a1 = new Animal();
			a1.eat();//Animal will eat!!
			
			Dog d1 = new Dog();
			d1.eat();//Dog is vegetarian
			
			//here compiler will bind based on the type of variable used
			Animal a2 = new Dog();
			a2.eat();//Animal will eat!!
			
			Animal a3 = null;
			a3.eat();//Animal will eat!!
		}
}
