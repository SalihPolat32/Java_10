package com.salihpolat.ders1;

import java.util.Scanner;

public class CalismaZamaiDiziBoyutu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int size, sum = 0; // Array boyutunu (size) sonradan da belirlenebilir. Önemli
		
		System.out.print("lütfen Dizinin Boyutunu Belirleyiniz: ");
		size = read.nextInt();
		
		short myArray [] = new short[size];
		
		System.out.println("Dizinin boyutu "+size+" olarak girildi.");
		
		/* Bu şekilde sağlıklı değil.
		myArray[0] = 10;
		System.out.println(myArray[0]);
		*/
		
		System.out.println("----------------------------------");
		// Array ve Döngüler beraber kullanılır.
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = read.nextShort();
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < myArray.length; i++) {
			// sum = sum + myArray[i]; // İkinci for yerine böyle de olur.
			System.out.println(myArray[i]);
		}
		// myArray[i] == item demektir.
		for (short item : myArray) {
			sum = sum + item;
		}
		System.out.println("Toplam: "+sum);
	}
}