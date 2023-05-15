package com.salihpolat;

public class _003_If_Else_IcIce {

	public static void main(String[] args) {
		
		// Ehliyet Alma --- Sağlıklı Olacak - 18'den Büyük Olacak
		// if (sağlıklı olacak VE 18'den büyük olacak)
		boolean saglikRaporu = true;
		int yasi = 25;
		if (saglikRaporu == true && yasi > 18) { // == eşit midir diye soruyor
			System.out.println("Evet. Ehliyet almaya uygunsunuz.");
		} else {
			System.out.println("Hayır. Ehliyet almaya uygun değilsiniz.");
		}
		System.out.println("-----------------------------");
		
		saglikRaporu = false;
		yasi = 25; 
		if (saglikRaporu == true && yasi > 18) {
			System.out.println("Evet. Ehliyet almaya uygunsunuz.");
		} else {
			System.out.println("Hayır. Ehliyet almaya uygun değilsiniz.");
		}
        System.out.println("-----------------------------");
		
		saglikRaporu = false;
		yasi = 8; 
		if (saglikRaporu == true && yasi > 18) {
			System.out.println("Evet. Ehliyet almaya uygunsunuz.");
		} else {
			
			if (saglikRaporu == false) {
				System.out.println("Sağlık raporunuz geçersiz.");
			}
			if (yasi < 18) {
				System.out.println("Yaşınız henüz 18 değil.");
			}
			System.out.println("Hayır. Ehliyet almaya uygun değilsiniz.");
		}
			System.out.println("------------------------------");
			
			saglikRaporu = true;
			yasi = 5;
			
			if (saglikRaporu==true&&yasi>=18) {
				System.out.println("Evet. Ehliyet alabilirsiniz.");
			} else {
				if (saglikRaporu==false) {
					System.out.println("Sağlık raporunuz geçersiz.");
				} else {
					System.out.println("Sağlık Raporunuz geçelidir.");
				} if (yasi<=18) {
					System.out.println("Hayır. Yaşınız 18'den küçüktür.");
				} else {
					System.out.println("Yaşınız ehliyet almaya uygundur. Sağlık raporunuz geçersizdir.");
				}
				System.out.println("Hayır. Ehliyet alamazsıznız.");
			}
	}
}