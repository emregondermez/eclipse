package day21_Scope;

public class Scope6 {
	public int num1;
	String name = "Ali";

	public static void main(String args) {
		add();
		// product (5); static olmayan bir method static olan main method icerisinden
		// cagrilamaz
	}

	public static void add() {
		// num1++; // static olmayan (instance) num1, static bir method icinden
		// kullanilamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");

		letter = 'a';
		System.out.println(num2 + " " + letter);
	}

	public void product(int num3) {
		name = "Veli";
		// num2++; // num2 ustteki methodda olusturulmus Local bir variable'dir.
		System.out.println(num3 * num3);
	}
}
