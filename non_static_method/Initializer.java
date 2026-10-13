package non_static_method;

import java.time.LocalDateTime;


		class Employee{
			String CompanyName = "Google";
			int eid;
			
			Employee(){
				System.out.println("No arg constructor");
			}
			
			Employee(int eid){
				this();
				System.out.println("Parameterized Constructor");
				this.eid=eid;
			}
			
			{
				PrintDetails();
				getDateAndTime();
			}	
		
		
		public void PrintDetails(){
			System.out.println(CompanyName);
			System.out.println(eid);
			
		}
		
		public void getDateAndTime() {
			System.out.println(LocalDateTime.now());
		}
		}
