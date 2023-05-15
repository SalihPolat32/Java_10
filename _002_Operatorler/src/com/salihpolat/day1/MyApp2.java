package com.salihpolat.day1;

public class MyApp2 {
	
	static int sayi; // 0
	
	public MyApp2() {
		
		sayi = 25; // 25
		
		System.out.println("Hazırlayıcı : "+sayi);
		
	}

	public static void main(String[] args) { // { -> scope demek yani kapsam
		
		//int sayi = 12; // ***ÖNEMLİ*** Değişken main içinde ise değer vermek zorunludur.
		// Static içinde 0 değerini otomatik atar.
		System.out.println("main metodu 1. Durum: "+sayi);
		
		MyApp2 myObj = new MyApp2();
		
		System.out.println("main metodu 2. Durum: "+sayi);

	}

}
