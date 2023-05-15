package com.salihpolat.day2;

import java.util.Scanner;

public class Secim2 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner((System.in));
			System.out.println("Lütfen Yaşınızı Giriniz: ");
			int secmenYasi = scanner.nextInt() , yasSiniri = 18;
			
			System.out.println(secmenYasi >= yasSiniri);
			
			if (secmenYasi >= yasSiniri) {
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
