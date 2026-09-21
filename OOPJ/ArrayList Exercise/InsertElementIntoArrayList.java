import java.util.ArrayList;

public class InsertElementIntoArrayList {
	public static void main(String[] args) {
			
			ArrayList<String> colors = new ArrayList<String>();
			
			colors.add("Red");
			colors.add("Blue");
			colors.add("Yellow");
			colors.add("Green");
			colors.add("White");
			
			colors.add(0, "Orange");
			
			System.out.println("Colors List: " + colors);
		}
}
