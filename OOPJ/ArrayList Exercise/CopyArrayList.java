import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Blue");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		
		ArrayList<String> colors2 = new ArrayList<String>();
		
		colors2.add("");
		colors2.add("");
		colors2.add("");
		colors2.add("");
		colors2.add("");
		
		Collections.copy(colors2, colors1);
		
		System.out.println("1st ArrayList: " + colors1);
		System.out.println("2nd ArrayList: " + colors2);
	}

}
