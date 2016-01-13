
import java.util.Scanner;
@SuppressWarnings("resource")
class GenerateRandomNumbers{
	
	int num;
	
	public void PrintRandomNumbers(int n){
		for(int i = 0; i<n-1; i++){
			
			
            System.out.println("Random number is : " +((int) (Math.random()*n)));
         }
	}
	
    public static void main(String [] args){

    	GenerateRandomNumbers randomNum = new GenerateRandomNumbers();
    	
    	
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number check it is a prime or not");
		
		randomNum.num= reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Number entered by user is : "+randomNum.num);
		
		randomNum.PrintRandomNumbers(randomNum.num);
    	
        
    }
}
