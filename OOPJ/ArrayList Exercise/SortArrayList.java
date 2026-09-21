import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("White");
		
		System.out.println("Colors List: " + colors);
		
		Collections.sort(colors);
		
		System.out.println("Sorted Colors List: " + colors);
	}

}