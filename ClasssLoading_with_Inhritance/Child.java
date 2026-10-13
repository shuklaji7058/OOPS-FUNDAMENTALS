package ClasssLoading_with_Inhritance;

public class Child {
	static {
		System.out.println("Child is loaded!");
	}
	public static void respect() {
		System.out.println("respect parents!");
	}
}
