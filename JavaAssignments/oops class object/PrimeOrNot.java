import java.util.Scanner;
@SuppressWarnings("resource")
public class PrimeOrNot {

	int num,i,flag;
	
	public PrimeOrNot(){
		flag=0;
	}
	
	public void IsPrime(int n){
		
		if(n==1 || n==2){
			System.out.println(n+" is a prime number.");
		}else{
			for(i=2;i<=n/2;++i)
			  {
			      if(n%i==0)
			      {
			          flag=1;
			          break;
			      }
			  }
			  if (flag==0){
			      System.out.println(n+" is a prime number.");
			  }
			  else{
				  System.out.println(n+" is not a prime number.");
			  }
		}
	}
	
	
	public static void main(String[] args) {
		
		PrimeOrNot number = new PrimeOrNot();
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number check it is a prime or not");
		
		number.num= reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Number entered by user is : "+number.num);
		
		number.IsPrime(number.num);
		

	}

}
