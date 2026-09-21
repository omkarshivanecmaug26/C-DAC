import java.util.TreeSet;
import java.util.Collections;
	
public class CeilingMethodTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> colors = new TreeSet<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		
		String givenColor = "Black";
		String result = colors.ceiling(givenColor);
		
		System.out.println("TreeSet: " + colors);
		System.out.println("Given Color: " + givenColor);
		System.out.println("Element Greater than Equal to Given Color " + givenColor +" : "  + result);
	}

}