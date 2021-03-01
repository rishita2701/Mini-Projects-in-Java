//Developed by Rishita Mukherjee

import java.util.*;

abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}


public class Project3_1037 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			
			do {
				System.out.print("\n1. Interest Calculator – SB ");
				System.out.print("\n2. Interest Calculator – FD ");
				System.out.print("\n3. Interest Calculator – RD ");
				System.out.print("\n4. Exit");
				System.out.print("\nEnter your option (1..4): ");
				
				choice  = sc.nextInt();
				
				switch (choice) {
				case 1:
					SBAccount sbAccount = new SBAccount();
					System.out.print("\nEnter the amount in your account: ");
					sbAccount.setAmount(sc.nextDouble());
					System.out.print("\nEnter the type of account (Normal or NRI) : ");
					sbAccount.accountType= sc.next();
					System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
					break;
					
				case 2:
					FDAccount fdAccount = new FDAccount();
					System.out.print("\nEnter the FD ammount: ");
					fdAccount.setAmount(sc.nextDouble());
					
					System.out.print("\nEnter number of days: ");
					int noOfDays = sc.nextInt();
					while (noOfDays < 0) {
						System.out.println("Invalid Number of days. Please enter correct values.");
						System.out.print("\nEnter number of days: ");
						noOfDays = sc.nextInt();
					}
					fdAccount.setNoOfDays(noOfDays);
					
					System.out.print("\nEnter your age: ");
					int age = sc.nextInt();
					while (age < 0) {
						System.out.println("Invalid age. Please enter correct values.");
						System.out.print("\nEnter your age: ");
						age = sc.nextInt();
					}
					fdAccount.setAgeOfACHolder(age);
					
					System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
					break;
					
				case 3:
					RDAccount rdAccount = new RDAccount();
					System.out.print("\nEnter the RD ammount: ");
					rdAccount.setAmount(sc.nextDouble());
					
					System.out.print("\nEnter number of months: ");
					int noOfMonths = sc.nextInt();
					while (noOfMonths < 0) {
						System.out.println("Invalid Number of months. Please enter correct values.");
						System.out.print("\nEnter number of months: ");
						noOfMonths = sc.nextInt();
					}
					rdAccount.setNoOfMonth(noOfMonths);
					
					System.out.print("\nEnter your age: ");
					age = sc.nextInt();
					while (age < 0) {
						System.out.println("Invalid age. Please enter correct values.");
						System.out.print("\nEnter your age: ");
						age = sc.nextInt();
					}
					rdAccount.setAgeOfACHolder(age);
					
					System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
					break;
					
				case 4:
					System.out.println("Thanks for using Interest Calculator.");
					break;
					
				default:
					break;
				}
					
			} while (choice != 4);
			
			sc.close();
		}

}

class FDAccount extends Account {
	private int noOfDays;
	private int ageOfACHolder;

	@Override
	public double calculateInterest() {
		double rateOfInterest = 0;
		double interest= 0;
		
		if (amount < 10000000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 4.5;
			} else if (noOfDays > 15 && noOfDays <= 29) {
				rateOfInterest = 4.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 5.5;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 7;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 7.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 8;
			}
			
			if (ageOfACHolder >= 65) rateOfInterest += 0.5;
		} else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 6.5;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 8;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 8.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 10;
			}
		}
		
		interest = amount * rateOfInterest / 100;
		
		return interest;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

class SBAccount extends Account {
	
	public String accountType;
	@Override
	public double calculateInterest() {
		
		if (accountType.equals("Normal")) 
			setInterestRate(4);
		if (accountType.equals("NRI")) 
			setInterestRate(6);

		
		double amount = getAmount();
		double interestRate = getInterestRate();
		double interest = amount * interestRate / 100.0;
		
		return interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

class RDAccount extends Account {
	private int noOfMonth;
	private double monthlyAmount; 
	private int ageOfACHolder;

	@Override
	public double calculateInterest() {
		double rateOfInterest = 0;
		double interest = 0;
		
		if (noOfMonth >= 6 && noOfMonth < 9) {
			rateOfInterest = 7.5;
		} else if (noOfMonth >= 9 && noOfMonth < 12) {
			rateOfInterest = 7.75;
		} else if (noOfMonth >= 12 && noOfMonth < 15) {
			rateOfInterest = 8;
		} else if (noOfMonth >= 15 && noOfMonth < 18) {
			rateOfInterest = 8.25;
		} else if (noOfMonth >= 18 && noOfMonth <= 21) {
			rateOfInterest = 8.5;
		} else if (noOfMonth >= 21) {
			rateOfInterest = 8.75;
		}
		
		if (ageOfACHolder >= 65) rateOfInterest += 0.5;
		
		interest = amount * rateOfInterest / 100;
		
		return interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNoOfMonth() {
		return noOfMonth;
	}

	public void setNoOfMonth(int noOfMonth) {
		this.noOfMonth = noOfMonth;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

}


//Developed by Rishita Mukherjee
