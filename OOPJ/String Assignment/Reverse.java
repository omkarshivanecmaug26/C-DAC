
public class Reverse {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps";
		String reverse = "";
		
		for (int index = str.length()-1; index >= 0; index--){
			reverse = reverse + str.charAt(index);
		}
		
		System.out.println("The given String is: " + str);
		System.out.println("The String in reverse order is: " + reverse);
	}

}
