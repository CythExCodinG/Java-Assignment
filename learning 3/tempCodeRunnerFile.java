import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsExercises {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		// 1. Create an ArrayList, add colors, and print it.
		System.out.println("1. Colors: " + colors);

		// 2. Insert an element at the first position.
		colors.add(0, "Black");
		System.out.println("2. After inserting Black at index 0: " + colors);

		// 3. Retrieve an element at a specified index.
		int indexToRetrieve = 2;
		System.out.println("3. Element at index " + indexToRetrieve + ": "
				+ colors.get(indexToRetrieve));

		// 4. Find a specified element and update it.
		String oldColor = "Green";
		int colorIndex = colors.indexOf(oldColor);
		if (colorIndex >= 0) {
			colors.set(colorIndex, "Emerald");
		}
		System.out.println("4. After replacing Green with Emerald: " + colors);

		// 5. Remove the third element (index 2).
		colors.remove(2);
		System.out.println("5. After removing the third element: " + colors);

		// 6. Search for an element.
		String searchColor = "Blue";
		System.out.println("6. Contains " + searchColor + "? "
				+ colors.contains(searchColor));

		// 7. Sort the ArrayList.
		Collections.sort(colors);
		System.out.println("7. Sorted colors: " + colors);

		// 8. Copy the ArrayList into another ArrayList.
		ArrayList<String> copiedColors = new ArrayList<>(
				Collections.nCopies(colors.size(), null));
		Collections.copy(copiedColors, colors);
		System.out.println("8. Copied colors: " + copiedColors);

		// 9. Shuffle the elements.
		Collections.shuffle(colors);
		System.out.println("9. Shuffled colors: " + colors);

		// 10. Reverse the elements.
		Collections.reverse(colors);
		System.out.println("10. Reversed colors: " + colors);

		// 11. Create a TreeSet, add colors, and print it.
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("Yellow");
		System.out.println("11. TreeSet colors (natural order): " + treeColors);

		// 12. Add all elements of one TreeSet to another.
		TreeSet<String> moreColors = new TreeSet<>();
		moreColors.add("Black");
		moreColors.add("White");
		moreColors.addAll(treeColors);
		System.out.println("12. After adding all colors: " + moreColors);

		// 13. Get a reverse-order view of the TreeSet.
		System.out.println("13. Reverse-order view: " + treeColors.descendingSet());

		// 14. Get the first and last elements.
		System.out.println("14. First: " + treeColors.first()
				+ ", last: " + treeColors.last());

		// 15. Get the least element greater than or equal to the given color.
		String requestedColor = "Lime";
		System.out.println("15. Ceiling of " + requestedColor + ": "
				+ treeColors.ceiling(requestedColor));
	}
}
