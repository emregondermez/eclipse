package day03;

public class C03_AutoWidening {

	public static void main(String[] args) {

		byte sayi1= 44;
	
		short sayi2= sayi1;
		// esitligin sol tarafi short sag tarafi byte
		// iki data turu farkli oldugu halde java itiraz etmiyor
		//	cunku atama yapilan variable'nin data turu (short) atanan degerin
		// veri turunden (byte) buyuk oldugundan sorun olusmaz
		System.out.println("sayi2 : "+sayi2);
	
	
		int sayi3= 55;
		double sayi4= sayi3;
		System.out.println("sayi4 = "+sayi4);
		
		// atanan degerin data turu deger atanan varible'nin data turunden kucukse
		// java castting'i otomatik yapar 
		// bu isleme auto widening denir
		
	}

}
