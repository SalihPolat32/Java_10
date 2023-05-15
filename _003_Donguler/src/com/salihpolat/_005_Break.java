package com.salihpolat;

public class _005_Break {

	public static void main(String[] args) {
		
		System.out.println("--------For Break-------");
		for (int i = 0; i < 25; i++) {
			
			// 20 sayısını bul ve çık
			if (i == 20) {
				System.out.println("20 Sayısını Buldum.");
				break;
			} else {
			    System.out.println("Değil: "+i);
			}
		}
		
		System.out.println("-----While Break------");
		
		int i = 0;
		while (i<25) {
			if (i == 20) {
				System.out.println("20 Sayısını Buldum.");
				break;
			} else {
			    System.out.println("Değil: "+i);
			} 
			i++;
		}
	}
}
