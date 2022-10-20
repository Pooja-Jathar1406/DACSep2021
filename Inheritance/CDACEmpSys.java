abstract class Employee{
	
	private int empId;
	private String empName;
	double salary;
	
	abstract double getSalary();
	abstract void printDetails();
	//--------- setId and getId for accessing priivate empId in child classes  --------- 
	void setId(int empId){
		this.empId=empId;
	}
	int getId(){
		return this.empId;
	}
	//--------- setId and getId for accessing priivate empName in child classes  --------- 
	void setName(String empName){
		this.empName=empName;
	}
	String getName(){
		return this.empName;
	}
}

//********************** Regular Employee **********************
class RegEmployee extends Employee{ 
    double basicPay;
	RegEmployee(){
		
	}
	RegEmployee(int empId, String empName, double basicPay){
		setId(empId);
		setName(empName);
		this.basicPay=basicPay;
	}
	double getSalary(){
		salary = basicPay*1.7;
		return salary;
	}
	void printDetails(){
		System.out.println("-----------------  Regular Employee  -------------- ");
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary()); 
		System.out.println();
	}
}

//********************** Contract Based Employee  **********************
abstract class ContractBasedEmployee extends Employee{
	int NoOfYears;
}

//********************** Cdac Contract Based Employee **********************
class CdacCBEmployee extends ContractBasedEmployee {
	double basicPay;
	CdacCBEmployee(){
		
	}
	CdacCBEmployee(int empId, String empName, double basicPay, int NoOfYears){
		setId(empId);
		setName(empName);
		this.basicPay=basicPay;
		this.NoOfYears=NoOfYears;
	}
	double getSalary(){
		salary = basicPay*1.7;
		return salary;
	}
	void printDetails(){
		System.out.println("-----------------  CDAC contract based Employee  -------------- ");
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary()); 
		System.out.println("No. of years: "+NoOfYears); 
		System.out.println();
	}
}

//********************** Third Party Contract Based Employee **********************
class ThirdPartyCBEmployee extends ContractBasedEmployee{
	double basicPay;
	ThirdPartyCBEmployee(){
		
	}
	ThirdPartyCBEmployee(int empId, String empName, double basicPay, int NoOfYears){
		setId(empId);
		setName(empName);
		this.basicPay=basicPay;
		this.NoOfYears=NoOfYears;
	}
	double getSalary(){
		salary = basicPay*1.7;
		return salary;
	}
	void printDetails(){
		System.out.println("-----------------  Contract based third party Employee  -------------- ");
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary()); 
		System.out.println("No. of years: "+NoOfYears); 
		System.out.println();
	}
}

//********************** CDACEmpSys -main **********************
class CDACEmpSys{
	public static void main(String args[]){
		RegEmployee re= new RegEmployee(1, "Pooja", 25000);
		re.printDetails();
		
		CdacCBEmployee ccbe= new CdacCBEmployee(112, "Pragati", 45000, 6);
		ccbe.printDetails();
		
		ThirdPartyCBEmployee tpcbe= new ThirdPartyCBEmployee(1123, "Prachi", 55000,3);
		tpcbe.printDetails();
	}
}