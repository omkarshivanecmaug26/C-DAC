import java.util.ArrayList;
import java.util.Collections;
	
public class ReverseElementsInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		System.out.println("Original List: " + colors);
		
		Collections.reverse(colors);
		
		System.out.println("Reversing List: " + colors);
		
	}

}