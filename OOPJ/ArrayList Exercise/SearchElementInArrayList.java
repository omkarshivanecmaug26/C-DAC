import java.util.ArrayList;
import java.util.Collections;

public class SearchElementInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("White");
		
		String searchColor = "Black";
		
		if (colors.contains(searchColor)) {
			System.out.println(searchColor + " Color is present in ArrayList");
		}
		else {
			System.out.println(searchColor + " Color is not prsent is ArrayList");
		}
	}

}
