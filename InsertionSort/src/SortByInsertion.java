//Demonstrating sorting by Insertion in asc order
public class SortByInsertion {

	public static void insertionSort(char[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) { 					// begin with second character
			char current = data[k]; 					// time to insert cur=data[k]
			int j = k; 									// find correct index j for cur
			while (j > 0 && data[j - 1] > current) { 	// thus, data[j-1] must go after cur
				data[j] = data[j - 1]; 					// slide data[j-1] rightward
				j--; 									// and consider previous j for cur
			}
			data[j] = current; 							// this is the proper place for cur
		}//end for-loop
	}//end insertion method

	public static void main(String[] args) {

		char[] myTestArr = { 'f', 'c', 'g', 'b' };		// Tets char array to apply insertion sort
		System.out.println("Before sorting: ");
		System.out.println("" + new String(myTestArr));
		System.out.println("After sorting: ");
		insertionSort(myTestArr);
		System.out.println("" + new String(myTestArr));

	}// end main

}// end class
