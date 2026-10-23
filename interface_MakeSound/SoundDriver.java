package interface_MakeSound;

		public class SoundDriver {

		    public static void main(String[] args) {

		        Sound s;

		        s = new Dog();
		        s.makeSound();

		        s = new Cat();
		        s.makeSound();

		        s = new Cow();
		        s.makeSound();
		    }
}
