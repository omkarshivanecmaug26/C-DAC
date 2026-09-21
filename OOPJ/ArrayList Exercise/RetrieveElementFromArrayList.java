import java.util.ArrayList;

public class RetrieveElementFromArrayList {
	public static void main(String[] args) {
			
			ArrayList<String> colors = new ArrayList<String>();
			
			colors.add("Red");
			colors.add("Blue");
			colors.add("Yellow");
			colors.add("Green");
			colors.add("White");
			
			System.out.println(colors.get(2));
		}
}
