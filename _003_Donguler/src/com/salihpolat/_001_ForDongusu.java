package com.salihpolat;

public class _001_ForDongusu {

	public static void main(String[] args) {
		
		//   Baslangıc  Sart    Değişim
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("-----------------------");
		
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
			
		}
		
		System.out.println("-----------------------");
		
		for (int sayi = 0; sayi < 10; sayi++) { //Scope
			if(sayi==3) {
			System.out.println("Üç Sayısını Buldum: "+sayi);
		}
			System.out.println("\t"+sayi);
			System.out.println("\n"+sayi);
			
		}
		
		System.out.println("-----------------------");
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("\ni: "+i);
			
			for (int j = 1; j < 3; j++) {
				
				System.out.println("\t"+"j: "+j);
					
			}	
		}
	}
}
