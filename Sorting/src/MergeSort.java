//The recursive merge sort algorithm

import java.util.*;

public class MergeSort {
	/** Merge-sort contents of array S. */
	public static <K> void mergeSort(K[] S, Comparator<K> comp) {
		int n = S.length;
		if (n < 2)
			return; // array is trivially sorted
		
		// divide
		int mid = n / 2;
		K[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
		K[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
		
		// conquer (with recursion)
		mergeSort(S1, comp); // sort copy of first half
		mergeSort(S2, comp); // sort copy of second half
		// merge results
		merge(S1, S2, S, comp); // merge sorted halves back into original
	}
}// end class
