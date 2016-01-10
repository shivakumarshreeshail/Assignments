
//To print prime numbers between 1 and 100
public class PrimeNumbers {
	
	public static void main(String[] args) {

		int Limit = 100;

		System.out.println("Prime numbers between 1 and " + Limit);

		// loop through the numbers one by one
		for (int i = 1; i<Limit; i++) {

			boolean isPrimeNumber = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}
			
			// print the number if prime
			if (isPrimeNumber) {
				System.out.print(i + " ");
			}
		}

	}

}