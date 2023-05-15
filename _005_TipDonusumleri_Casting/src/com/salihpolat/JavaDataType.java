package com.salihpolat;

public class JavaDataType { // Scope 1
	
	static int i = 10;
	int b = 1;
	int j = 2;
	int k = 3;

	public static void main(String[] args) { // Scope 2
		
		boolean medeniDurum = true; //YES yes NO no 1 0 TRUE FALSE - Java böyle kabul etmez sadece true ve false kabul eder
		byte yasi = 127;
		short yonetimUyeSayisi =32767;
		char kursSubesi = 'A';
		int ulkeNufusu = 2_147_483_647;
		
		long bankaToplamHesabi1 = 100; // Sonuna float gibi l veya L eklenebilir
		long bankaToplamHesabi2 = 100l;
		long bankaToplamHesabi3 = 100L;
		
		float piSayisi1 = (float) 3.14;
		float piSayisi2 = 3.14f;
		float piSayisi3 = 3.14F;
		
		double finansBankaHesabim1 = 1_000_000; // Sonuna float gibi d veya D eklenebilir
		double finansBankaHesabim2 = 1_000_000d; // Alt çizgi _ sayılar arasında kullanılır sadece kolay okunuş için.
		double finansBankaHesabim3 = 1_000_000D;
		
		String adi = "Mehmet Caner";
		String soyadi = "ÖKSÖZ";
		System.out.println(adi+" "+soyadi);
		
		System.out.println(i); //10
		
		JavaDataType obj = new JavaDataType();
		System.out.println(obj.b);
		obj.b = 40;
		System.out.println(obj.b);
		obj.j = 50;
		System.out.println(obj.j);
		obj.k = 60;
		System.out.println(obj.k);	
		
		System.out.println(obj.b); // Scope içinde bir kere değeri değitirdik öyle kaldı.
		JavaDataType obj2 = new JavaDataType(); // Tekrar çağırdığımızda scope dışı olduğu için ilk hali ile gelir.
		System.out.println(obj2.b);
	}
}
