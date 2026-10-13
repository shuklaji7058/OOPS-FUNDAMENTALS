package ClasssLoading_with_Inhritance;

public class Parent {
	static {
		System.out.println("Parent is loaded");
	}
	
	public static void nurture() {
		System.out.println("nurture kids!");
	}
}
