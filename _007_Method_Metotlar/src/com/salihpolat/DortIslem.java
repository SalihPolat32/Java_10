package com.salihpolat;

public class DortIslem {

	public static void main(String[] args) {

		DortIslem obj = new DortIslem();

		int sonuc = obj.toplama(10, 5);
		System.out.println(sonuc);

		obj.cizgiCiz();

		sonuc = obj.cıkarma(100, 80);
		System.out.println(sonuc);

		obj.cizgiCiz();

		System.out.println(obj.carpma(2, 3)); // Böyle de yazılabilir.

		obj.cizgiCiz();

		System.out.println(obj.bolme(5, 3));
		
	}

	private void cizgiCiz() {
		System.out.println("-------------------------------");
	}

	private int toplama(int i, int j) {
		return i + j;
	}

	private int cıkarma(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

	private int carpma(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	private double bolme(int i, int j) {
		return (double) i / j;
	}

}