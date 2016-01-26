
class Bank {
	public void getRateOfInterest() {
		System.out.print("Rate of interest in a bank is 9.0%"+"\n");
	}
}

class SBI_Bank extends Bank {
	public void getRateOfInterest() {
		System.out.print("Rate of interest in SBI bank is 9.5%"+"\n");
	}
}

class SBT_Bank extends Bank {
	public void getRateOfInterest() {
		System.out.print("Rate of interest in SBT bank is 10.0%"+"\n");
	}
}

class SBH_Bank extends Bank {
	public void getRateOfInterest() {
		System.out.print("Rate of interest in SBH bank is 10.5%"+"\n");
	}
}

public class OverrideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank B1 = new SBI_Bank();
		B1.getRateOfInterest(); 

		B1 = new SBT_Bank();
		B1.getRateOfInterest(); 
		
		B1 = new SBH_Bank();
		B1.getRateOfInterest(); 

	}

}
