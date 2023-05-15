package com.salihpolat.day2;

public class MyApp {

	public static void main(String[] args) {
		
		int sayi1, sayi2;
		sayi1 = 8;
		sayi2 = 3;
		
		int toplam = sayi1 + sayi2;
		System.out.println(toplam);

		int cıkarma = sayi1 - sayi2;
		System.out.println(cıkarma);
		
		int carpma = sayi1 * sayi2;
		System.out.println(carpma);
		
		int bölme = sayi1 / sayi2;
		System.out.println(bölme);
		
		System.out.println("-----------------");
		
		int sonuc = sayi1 + sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 - sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 * sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 / sayi2;
		System.out.println(sonuc);
		
		System.out.println("-----------------");
		
		float a = (float) 10.3;
		double b = 27.8;
				
		double result = a + b;
		System.out.println(result);
		
		float result2 = (float) (a + b);
		System.out.println(result2);
		
		System.out.println(String.format("%.7f",result2));
		
		System.out.println("-----------------");
				
		long zaman = 60 * 60 * 24 * 365;
		System.out.println(zaman);
		
	}

}
