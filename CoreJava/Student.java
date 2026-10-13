package CoreJava;

public class Student {
		int sid;
		String name;
		double marks;
		
		Student(){
		}
		
		Student(int sid){
			this.sid=sid;
		}
		
		Student(String name){
			this.name=name;
		}
		
		Student(int sid, String name, double marks){
			this.sid=sid;
			this.name=name;
			this.marks=marks;
		}
}
