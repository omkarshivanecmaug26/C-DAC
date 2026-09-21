import java.util.TreeSet;
import java.util.Collections;
	
public class AddElementsIntoAnotherTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> colors1 = new TreeSet<String>();
		colors1.add("Red");
		colors1.add("Blue");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Orange");
		
		TreeSet<String> colors2 = new TreeSet<String>();
		colors2.add("Black");
		colors2.add("White");
		
		colors2.addAll(colors1);
		
		System.out.println("TreeSet: " + colors1);
		System.out.println("TreeSet: " + colors2);
	}

}