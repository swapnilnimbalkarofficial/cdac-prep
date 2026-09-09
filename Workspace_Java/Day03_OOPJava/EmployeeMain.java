package Day3;

public class EmployeeMain {

	public static void main(String[] args) {
		PermenantEmployee[] allEmployees=new PermenantEmployee[3];
		
		allEmployees[0]=new PermenantEmployee(101,"Rahul",58000,5000,5900);
		//allEmployees[1]=new ContractualEmployee(102,"Ramesh",70000f);
		allEmployees[2]=new PermenantEmployee(103,"Virat Kohali",792000,9000,4900);
		
		for(Employee currentEmployee: allEmployees) {
			String empName=currentEmployee.getName();
			float processedSalary=currentEmployee.processSalary();
			System.out.println("Name: "+empName);
			System.out.println("Gross Salary: "+processedSalary);
		
		}
	}

}
