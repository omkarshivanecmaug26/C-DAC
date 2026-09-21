import java.util.ArrayList;
import java.util.Collections;
	
public class ShuffleElementsInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		System.out.println("Original List: " + colors);
		
		Collections.shuffle(colors);
		
		System.out.println("Shuffled List: " + colors);
		
	}

}
