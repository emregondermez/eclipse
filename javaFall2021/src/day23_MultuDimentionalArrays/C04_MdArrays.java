package day23_MultuDimentionalArrays;

public class C04_MdArrays {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array�in ic array�lerindeki
		// son elemanlarin carpimini ekrana yazdiran
		// bir program yaziniz { {1,2,3}, {4,5}, {6} }

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 2 } };

		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j < arr[i].length; j++) {
				carpim *= arr[i][j];
			}
		}

		System.out.println(carpim);
	}

}
