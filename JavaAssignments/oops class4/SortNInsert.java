import java.util.Arrays;

public class SortNInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = {4,9,7,2,0,1};
		PrintArray("Given array", Array);
		Arrays.sort(Array);
		PrintArray("Sorted array", Array);
		InserArrayValue("Insert value ",Array,3,10);
		PrintArray("Array after inserting a value ", Array);
	}

	public static void InserArrayValue(String Message, int[] array, int index,int value) {
		System.out.println(Message+value+" at index "+index );
		array[index] = value;
	}

	public static void PrintArray(String Message, int[] array) {
		System.out.println(Message);
		for (int i = 0; i < array.length; i++) {
			if (i!=0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}

}
