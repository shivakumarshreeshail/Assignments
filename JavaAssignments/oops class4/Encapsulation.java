
public class Encapsulation {
	public static void main(String[] args) {
		// public static void main(){
		emp e1 = new emp();

		e1.setEmpId(4);
		System.out.println("Employee ID : "+e1.getEmpId());

		e1.setEmpName("Employee1");
		System.out.println("Employee Name : "+e1.getEmpName());

	}
}

class emp {
	private int EmpId; //To hide data from the user
	String EmpName; // To hide data from the user

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}
}