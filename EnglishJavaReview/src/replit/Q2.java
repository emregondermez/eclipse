package replit;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri 
		 kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		
		char ch1= 'a' ;

			String name =“John came late" 

			Expected Output: 
			Number of a = 2
		*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim= scan.next();
		System.out.println("bir harf giriniz");
		String harf =scan.next();
		
	int counter= 0;
		
		for (int i = 0; i < isim.length(); i++) {
			if (isim.substring(i,i+1).equals(harf)) {
				counter++;
			}
		}
		System.out.println("Number of "+harf+" = "+counter);
		
		
		
		
		
		
		
		
		
	scan.close();
	}

}
