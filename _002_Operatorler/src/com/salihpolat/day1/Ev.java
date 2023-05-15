package com.salihpolat.day1;

public class Ev {
	
	static String sifre = "123";
	
	public Ev() { // Hazırlayıcı metot ilk harfi büyük olur.
		// Diğer metotlar küçük harfle başlar.
		
		sifre = "Ankara06";
		
		//System.out.println("Hazırlayıcı - Yapıcı: "+ sifre);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sifre);
		
		//System.out.println("main scope: "+anahtarNesnesi.sifre);
		
		//System.out.println(new Ev().sifre);
		
		Ev ev = new Ev();
		System.out.println(ev.sifre);
		
		ev.sifre = "Adana01";
		System.out.println(ev.sifre);
						
	}
}
