package com.salihpolat.day1;

public class OperatorlerVeDonguler {

	public static void main(String[] args) {
		/*
		int i = 0;
		System.out.println(i); // 0
		
		i = i + 3;
		System.out.println(i); // 3
		
		i += 2;
		System.out.println(i); // 5
		
		i++;
		System.out.println(i); // 6
		*/
		/*
		DONGU
		
		BASLANGIC 1 OCAK
		
		SART
		
		ARTIS MIKTARI 1 GUN
		
		BITIS SINIRI 31 ARALIK
		*/
		//   BASLANGIC   SART   ARTTIRIM
		for (int i = 0; i < 10; i++) { // SCOPE (Parantez) // for Süresince anlamında
			
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
			
		}
		
	    System.out.println("-------------------");
		
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		int i = 99;
        for (i = 0; i < 10; i++) {
			
			System.out.println(i);
		}
	}
}
