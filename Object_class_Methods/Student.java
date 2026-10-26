package Object_class_Methods;

import java.util.Objects;

public class Student {
		int Sid;
		String Name;
		double Marks;
		
		
		public Student() {
		}


		public Student(int Sid, String Name, double Marks) {
			super();
			this.Sid = Sid;
			this.Name = Name;
			this.Marks = Marks;
		}


		@Override
		public String toString() {
			return "Student [Sid=" + Sid + ", Name=" + Name + ", Marks=" + Marks + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(Name,Sid,Marks);
		}


		@Override
		public boolean equals(Object obj) {
			Student s = (Student) obj;
			return this.Sid==s.Sid && 
					this.Name.equals(s.Name) && 
					this.Marks==s.Marks;
		}
		
		
}
