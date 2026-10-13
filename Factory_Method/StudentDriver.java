package Factory_Method;

public class StudentDriver {
		public static void main(String[] args) {
			Student s1 = Student.createStudent().setsId(101).setName("Anish")
					.setCourse("Software Testing").setFeesPaid(30000)
					.setTotal_marks(77.83).DisplayDetails();
		}
}
