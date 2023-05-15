/**
 * Buraya Lisanslar yazılır.
 */
package com.salihpolat;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author Salih Polat
 * @since 2023
 * @version 1.0.0
 */
public class HelloMethods {

	/**
	 * 
	 */
	public HelloMethods() {
		// TODO Burayı tamamla
		System.out.println("Hazırlayıcı - Yapıcı");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ana merkez - main");

		HelloMethods obj = new HelloMethods();

		selamVer();
		obj.selamAl();
		
		cizgiCiz();

		System.out.println(obj.toplamaYap() * 2);
		
		cizgiCiz();
		
		int sonuc = obj.toplamaYapModern(10, 3);
		//              f(x, y) = 2x + y
		// x = 1, y = 2 f(1, 2) = 7
		System.out.println(sonuc);
		cizgiCiz();
		System.out.println(obj.toplamaYapModern(45, 2));

	}

	private static void cizgiCiz() {
		
		System.out.println("=======================================");
	}
	
	int toplamaYapModern(int sayi1, int sayi2) {
		
		return sayi1 + sayi2;
	}
	
	private int toplamaYap() {

		int sayi1 = 10;
		int sayi2 = 5;
		int sonuc = sayi1 + sayi2;
		// System.out.println(sonuc);
		// return sonuc;
		return sayi1 + sayi2;
	}

	private static void selamVer() { // Scope private - public olursa herkes kullanır.

		System.out.println("Selamlar, nasılsın?");
	}

	public void selamAl() { // Static olmazsa doğrudan çağıramayız. obj. kullanarak çağırırız.

		System.out.println("Selamını aldım.");
	}
}