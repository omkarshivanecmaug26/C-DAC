import java.util.ArrayList;
import java.util.Collections;

public class RemoveThirdElementFromArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("White");
		
		colors.remove(3);
		
		System.out.println("Colors List: " + colors);
	}

}
