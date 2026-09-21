import java.util.TreeSet;
import java.util.Collections;

public class ReverseElementsInTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> colors = new TreeSet<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Yellow");
		System.out.println("Original TreeSet: " + colors);
		
		TreeSet<String> reverseOrder = (TreeSet<String>) colors.descendingSet();
		System.out.println("Reversed TreeSet: " + reverseOrder);
		
		System.out.println("Reversed TreeSet: " + colors.descendingSet());
	}

}
