public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5 ,6};
		PrintArrayReverse("Reversed array", array);
	}

	private static void PrintArrayReverse(String message, int Array[]) {
		System.out.println(message + "\n");
		int i = 1;
		for (i = (Array.length) - i; i >= 0; i--) {
			if(i!=(Array.length) - 1){
				System.out.print(",");
			}
			System.out.print(Array[i] );

		}
	}

}
