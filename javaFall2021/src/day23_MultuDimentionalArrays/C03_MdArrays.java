package day23_MultuDimentionalArrays;

public class C03_MdArrays {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array�in tum elemanlarinin
		// carpimini ekrana yazdiran bir method yaziniz.
		// orn : { {1,2,3}, {4,5,6} }

		int arr[][] = { { 1, 2 }, { 4, 5, 7 } };

		carpimYazdir(arr);

	}

	public static void carpimYazdir(int[][] arr) {
		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				carpim *= arr[i][j];
			}
		}
		System.out.println(carpim);

	}

}
