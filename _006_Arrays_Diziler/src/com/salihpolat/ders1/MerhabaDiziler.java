package com.salihpolat.ders1;

public class MerhabaDiziler {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 14;
		int sayi3 = 15;
		int sayi4 = 22;

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3 + " " + sayi4);

		// Array (!!!Sıralı Olacak!!!)
		// Sıralar index diye ifade edilir.
		// index 0'dan baslar.
        // int sayi[] = null; // Dizilerde boş bırakma ifadesi null   //NullPointerException Hatası Veriyor
		int sayi [] = new int [4]; // Null yoluk zıttı new.
		// Dizilerde int ve Integer fark etmiyor ikisi de metotlarla çalışır. İlker tip ve class aynı çalışır.
		// new olan yerde nesne var demektir ve metot kullanılır.
		// int sayi[];
		// sayi = new int [4]; // 21 ve 22 sıradaki kod yukaradaki tanımla aynı anlama gelir.
		
		sayi[0] = 12;
		sayi[1] = 14;
		sayi[2] = 15;
		sayi[3] = 22;
		// sayi[4] = 25; // Açınca sınırı aşıyor
		// sayi[5] = 19;

		System.out.println(sayi[0] + " " + sayi[1] + " " + sayi[2] + " " + sayi[3]);
		
		// System.out.println(sayi[4]); // ArrayIndexOutOfBoundsException Hatası verir. Olmayan eleman olduğu için.
		
		System.out.println("Dizinin Sınırı: "+sayi.length); // length dizinin sınırını verir. Kaç eleman olduğunu gösterir.
		for (int index = 0; index < sayi.length; index++) { // index <= olamaz
			System.out.println(sayi[index]);
			
		}

	}
}