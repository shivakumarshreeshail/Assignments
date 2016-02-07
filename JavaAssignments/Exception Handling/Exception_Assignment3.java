
public class Exception_Assignment3 {

	public static void main(String[] args) {
		int a[] = null;
		try {
			System.out.print(a.length);
		} catch (NullPointerException e) {
			System.out.println("null pointer exception is handled\n");
		} finally {

		}

	}

}
