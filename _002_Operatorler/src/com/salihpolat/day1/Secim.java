package com.salihpolat.day1;

public class Secim {

	public static void main(String[] args) {
		
		int secmenYasi = 10, yasSiniri = 18;
		
		System.out.println(secmenYasi >= yasSiniri);
		
		// Karar kontrol mekanizması
		
		if (secmenYasi >= yasSiniri) { //(Şart)
		   System.out.println("Evet oy kullanabilirsiniz."); // Evet	
		}
		
		else {
		   System.out.println("Hayır oy kullanamazsınız."); // Hayır
		   System.out.println(yasSiniri-secmenYasi+" yıl sonra kullanabilirsiniz.");
		   
		} 
		
		System.out.println((secmenYasi >= yasSiniri)? "Evet" : "Hayır");
		
		System.out.println((secmenYasi >= yasSiniri)
				? 
						"Evet oy kullanabilirsiniz." 
			    : 
						"Hayır oy kullanamazsınız.\n"
			    +
						(yasSiniri-secmenYasi)+" yıl sonra kullanabilirsiniz.");

	}

}
