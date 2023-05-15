package com.salihpolat;

public class StringMethodlari {

	public static void main(String[] args) {

		String adi = "Mehmet Caner";

		System.out.println(adi.length());

		String adi2 = "Burak DELİCE";

		if (adi == adi2) {
			System.out.println("Aynı");
		} else {
			System.out.println("Aynı Değil");
		}
		if (adi.equals(adi2)) { // Yardımcı Metot
			System.out.println("Aynı");
		} else {
			System.out.println("Aynı Değil");
		}

		String str1 = "Adana";
		String str2 = "Merkez";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		String ogrenci = "Serkan"; // 'S', 'e', 'r', 'k', 'a', 'n'
		char[] karakterler = ogrenci.toCharArray();
		System.out.println(karakterler);
		for (int i = 0; i < karakterler.length; i++) {
			System.out.println(karakterler[i]);
		}
		
		System.out.println("-----------------------------");
		
		                // 0123 
		String personel = "Aysu Cansu Peteksu ÇAĞIŞLAR";
		System.out.print(personel.charAt(0));
		System.out.print(personel.charAt(1));
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("\n-----------------------------");
		
		System.err.println(personel.contains("su"));
		
		System.out.println("-----------------------------");
		
		String[] sonDurum = personel.split("su ");
		
		for (String item : sonDurum) {
			System.out.println(item);
		}	
		
		System.out.println("-----------------------------");
		
		System.out.println(personel.replace('u', 'T'));
		
	}
}