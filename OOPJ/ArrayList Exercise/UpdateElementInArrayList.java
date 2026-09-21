import java.util.ArrayList;
import java.util.Collections;

public class UpdateElementInArrayList {
	public static void main(String[] args) {
			
			ArrayList<String> colors = new ArrayList<String>();
			
			colors.add("Red");
			colors.add("Blue");
			colors.add("Yellow");
			colors.add("Green");
			colors.add("White");
			
			colors.set(3, "Pink");
			
			System.out.println("Colors List: " + colors);
		}
}
