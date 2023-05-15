package com.salihpolat;

public class _004_Switch {

	public static void main(String[] args) {
		
		// Sınavlar A B C D E
		
		char harf = 'A';
		switch (harf) { //A harfine eşit ise
		case 'A': // Durum
			System.out.println("Seçilen: "+harf);			
			break;
		case 'B':
			System.out.println("Seçilen: "+harf);			
			break;
		case 'C':
			System.out.println("Seçilen: "+harf);			
			break;
		case 'D': // Durum
			System.out.println("Seçilen: "+harf);			
			break;
	    /* case istediğimiz kadar ekleyebiliriz
        case value:
			break;
        case value:
	        break;
        */
		default:
			System.out.println("Seçiminiz "+harf+" uygun değil.");
			break;
		}
		
		System.out.println("-------------------");
		
		// if else ile olan kodu switch'e çevirdik.
		// switch daha sade görünüm ve daha gelişmiş.
		int haftaninGunu = 3;
		switch (haftaninGunu) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;	
		default:
			System.out.println("Lütfen 1 ile 7 arasında sayı giriniz.");
			break;
		}
		
		System.out.println("---------------------");
		
		char haftaninGunu2 = '3';
		switch (haftaninGunu2) {
		case '1':
			System.out.println("Pazartesi");
			break;
		case '2':
			System.out.println("Salı");
			break;
		case '3':
			System.out.println("Çarşamba");
			break;
		case '4':
			System.out.println("Perşembe");
			break;
		case '5':
			System.out.println("Cuma");
			break;
		case '6':
			System.out.println("Cumartesi");
			break;
		case '7':
			System.out.println("Pazar");
			break;	
		default:
			System.out.println("Lütfen 1 ile 7 arasında sayı giriniz.");
			break;
		}
		
		System.out.println("--------------------");
		
		String haftaninGunu3 = "3";
		switch (haftaninGunu3) {
		case "1":
			System.out.println("Pazartesi");
			break;
		case "2":
			System.out.println("Salı");
			break;
		case "3":
			System.out.println("Çarşamba");
			break;
		case "4":
			System.out.println("Perşembe");
			break;
		case "5":
			System.out.println("Cuma");
			break;
		case "6":
			System.out.println("Cumartesi");
			break;
		case "7":
			System.out.println("Pazar");
			break;	
		default:
			System.out.println("Lütfen 1 ile 7 arasında sayı giriniz.");
			break;
		}
		
		// int - char - string hangisi ile yazılırsa içi de o çeşitte olmalı
		
		System.out.println("-------------------------------");
		
		int haftaninGunu4 = 3;
		String haftaninGunuDegeri=null;
		switch (haftaninGunu4) {
		case 1:
			haftaninGunuDegeri = "Pazartesi";
			break;
		case 2:
			haftaninGunuDegeri = "Salı";
			break;
		case 3:
			haftaninGunuDegeri = "Çarşamba";
			break;
		case 4:
			haftaninGunuDegeri = "Perşembe";
			break;
		case 5:
			haftaninGunuDegeri = "Cuma";
			break;
		case 6:
			haftaninGunuDegeri = "Cumartesi";
			break;
		case 7:
			haftaninGunuDegeri = "Pazar";
			break;	
		default: // default en üstte de olabilir.
			System.out.println("Lütfen 1 ile 7 arasında sayı giriniz.");
			break;
		}
		if (haftaninGunuDegeri == null) { // == eşit ise demek
			
		} else {
			System.out.println("1. Durum: "+haftaninGunuDegeri);
			
		}
        if (haftaninGunuDegeri != null); { // != eşit değil ise demek
			System.out.println("2. Durum: "+haftaninGunuDegeri);
		}
        
        System.out.println("-----------------------");
        
        // hafta içi - hafta sonu
        // 1 2 3 4 5 - 6 7 
        int gunSirasi = 1;
        switch (gunSirasi) {
		case 1: System.out.println("Pazartesi");
		case 2: System.out.println("Salı");
		case 3: System.out.println("Çarşamba");
		case 4: System.out.println("Perşembe");
		case 5: System.out.println("Cuma");
			System.out.println("Hafta İçi");
			break;
			
		case 6: System.out.println("Cumartesi");
		case 7: System.out.println("Pazar");
			System.out.println("Hafta Sonu");
			break;

		default:
			System.out.println("Lütfen 1 ile 7 arasında sayı giriniz.");
			break;	
		}
	}
}