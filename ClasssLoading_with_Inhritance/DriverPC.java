package ClasssLoading_with_Inhritance;

public class DriverPC {
	public static void main(String[] args) {
//		Case-1:
		Parent.nurture();//Parent is loaded
						//nurture kids!
		
		Child.respect();//Child is loaded!
					   //Respect Parents!
		
//		Case-2:
		Child.respect();//Respect Parents!
	}
}
