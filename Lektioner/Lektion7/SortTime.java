package lektioner.Lektion7;
import java.util.Arrays;

/**
 * Ex07_08 - SortTime
 *
 * Jämför hur lång tid det tar att sortera en array av typen int
 * med 100_000 slumpade element med selection sort och Arrays.sort.
 *
 * @author Robert Jonsson
 */
public class SortTime {
	// Sorterar en array mha urvalsmetoden
	// Obs, här upprepar vi samma kod/metod som i exemplet
	// SelectionSort. Denna metod bör flyttas till vår hjälpklass Util.
	public void selectionSort(int[] numbers) {
		System.out.print("Sorting using selection sort... ");
		long start = System.currentTimeMillis();

		// Börjar sortera
		for (int i = 0; i < numbers.length - 1; i++) {
			// Sätter startgissning för minsta talet till index i
			int minIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				// Är talet mindre får vi nytt minIndex
				if (numbers[j] < numbers[minIndex])
					minIndex = j;
			}

			// Byter plats så att minsta talet kommer på plats
			int tmp = numbers[i];
			numbers[i] = numbers[minIndex];
			numbers[minIndex] = tmp;
		}

		long time = System.currentTimeMillis() - start;
		System.out.println(time + " ms");
	}

	// Sorterar en array mha Arrays.sort.
	public void arraysSort(int[] numbers) {
		System.out.print("Sorting using Arrays.sort... ");
		long start = System.currentTimeMillis();

		// Börjar sortera
		Arrays.sort(numbers);

		long time = System.currentTimeMillis() - start;
		System.out.println(time + " ms");
	}

	public static void main(String[] args) {
		// Skapar ett objekt av klassen
		SortTime st = new SortTime();

		// Skapar en array med 100_000 slumpade tal i intervallet
		// -100_000 till 100_000
		int[] selectionSortArray = Util.createArrayWithRandomNumbers(100_000, -100_000, 100_000);

		// Gör en kopia av arrayen med hjälp av metoden clone (som ärvs från klassen Object)
		int[] arraysSortArray = selectionSortArray.clone();

		// Sorterar med selection sort
		st.selectionSort(selectionSortArray);

		// Sorterar med Arrays.sort
		st.arraysSort(arraysSortArray);
	}
}