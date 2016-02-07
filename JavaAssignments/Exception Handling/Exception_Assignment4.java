
public class Exception_Assignment4 {
	String S = "Acadgild";

	public static void main(String[] args) {
		// StringIndexOutOfBound
		Exception_Assignment4 obj = new Exception_Assignment4();
		try {
			System.out.println(obj.S.charAt(20));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(" exception is handled\n");
		} finally {

		}

	}

}
