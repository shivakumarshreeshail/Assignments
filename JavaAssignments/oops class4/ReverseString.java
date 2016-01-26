import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
				
		Class C = new Class();
		@SuppressWarnings("resource")
		Scanner ReadString = new Scanner(System.in);
		System.out.println("Enter a string");
		
		C.Name = ReadString.next();
		C.StringReverse(C.Name);
	}

}

class Class{
	
	String Name;
	
	public void StringReverse(String name){
		for(int i=(int) name.chars().count()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}
}