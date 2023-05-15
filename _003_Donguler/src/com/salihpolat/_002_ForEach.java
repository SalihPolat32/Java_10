package com.salihpolat;

public class _002_ForEach {

	public static void main(String[] args) {
		
		/*
		 * Ogrenci Listesi
		 * Ahmet
		 * Mehmet
		 * ALİ
		 * Veli
		 * Zeynep
		 * Ayşe
		 */
		
		// Array Dizi
		
		String [] ogrenciler = {"Ahmet","Mehmet","Ali","Veli","Zeynep","Ayşe"};		
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
			
			}
		
		System.out.println("------------------------");
		
		                //0,1,2,3,4
		int numbers[] = { 1,2,3,4,5};
		for (int number : numbers) {
			
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[2]);
			System.out.println(numbers[3]);
			System.out.println(numbers[4]);
			
			System.out.print(number*3+" ");
			
		}

	}

}
