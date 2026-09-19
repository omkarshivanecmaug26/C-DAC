
public class StringEndsWith {
	public static void main(String[] args) {
		String str1 = "Python Exercises";
		String str2 = "Python Exercise";
		String suffix = "se";
		
		System.out.println("\"" + str1 + "\" ends with \"" + suffix + "\"? " + str1.endsWith(suffix));
		System.out.println("\"" + str2 + "\" ends with \"" + suffix + "\"? " + str2.endsWith(suffix));
	}

}
