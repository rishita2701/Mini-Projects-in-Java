''' Developed by Rishita Mukherjee '''

import java.util.Scanner;

public class Project1_1037 {

	int EmpNo;
	int basic,hra,it,da;
	String name,date,code,dept,designation;
	
	public Project1_1037(int empNo, int basic, int hra, int it, String name, String date, String code, String dept) {
		super();
		this.EmpNo = empNo;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
		this.name = name;
		this.date = date;
		this.code = code;
		this.dept = dept;
		
		if(this.code=="e") {
			this.designation="Engineer";
			this.da=20000;
		}
		else if(this.code=="c") {
			this.designation="Consultant";
			this.da=32000;
		}
		else if(this.code=="k") {
			this.designation="Clerk";
			this.da=12000;
		}
		else if(this.code=="r") {
			this.designation="Receptionist";
			this.da=15000;
		}
		else if(this.code=="m") {
			this.designation="Manager";
			this.da=40000;
		}
	}
	
	public void displayInfo()
	{
		System.out.println("Emp No."+ " "+"Emp Name"+ " "+"Department"+ " "+"Designation"+ " "+"Salary"+ " ");
		System.out.println(this.EmpNo+"    "+this.name+"    "+this.dept+"       "+this.designation+"       "+(this.basic+this.hra+this.da-this.it));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project1_1037 emp[]=new Project1_1037[7];
		emp[0]=new Project1_1037(1001,20000,8000,3000,"Ashish","01/04/2009","e","R&D");
		emp[1]=new Project1_1037(1002,30000,12000,9000,"Sushma","23/08/2012","c","PM");
		emp[2]=new Project1_1037(1003,10000,8000,1000,"Rahul","12/11/2008","k","Acct");
		emp[3]=new Project1_1037(1004,12000,6000,2000,"Chahat","29/01/2013","r","Front Desk");
		emp[4]=new Project1_1037(1005,5000,20000,20000,"Ranjan","16/07/2005","m","Engg");
		emp[5]=new Project1_1037(1006,23000,9000,4400,"Suman","1/1/2000","e","Manufacturing");
		emp[6]=new Project1_1037(1007,29000,12000,10000,"Tanmay","12/06/2006","c","PM");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee number : ");
		int id=sc.nextInt();
		switch(id) {
		
		case 1001 :
			emp[0].displayInfo();
			break;
		case 1002:
			emp[1].displayInfo();
			break;
		case 1003:
			emp[2].displayInfo();
			break;
		case 1004:
			emp[3].displayInfo();
			break;
		case 1005:
			emp[4].displayInfo();
			break;
		case 1006:
			emp[5].displayInfo();
			break;
		case 1007:
			emp[6].displayInfo();
			break;
		default:
			System.out.println("There is no employee with empid: "+id);
				
		}

	}

}
''' Developed by Rishita Mukherjee '''
