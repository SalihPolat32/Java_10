package com.salihpolat;

public class _002_If_Else {

	public static void main(String[] args) {
		
        if (1<25) {
			System.out.println("1 Evet");
		} else {
            System.out.println("1 Hayır");
		}
        
        int a = 0;
        a = 100;
        if (a<25) {
			System.out.println("2 Evet");
		} else {
            System.out.println("2 Hayır");
		}
        
        System.out.println("----------------------"); 
        
        /*
        if şart
            1. durum
        else
        	2. durum
        */
        int x=25;
        if (x==10) {
			System.out.println("Evet 10'a eşit. ");
		} 
        else if (x==20) { // 20'ye eşit mi?
			System.out.println("Evet 20'ye eşit.");			
		}
        else {
			System.out.println("Değil");
		}
        
        System.out.println("----------------------");
        
        //Haftanın Günleri
        System.out.println("Haftanın Günleri");
        System.out.println("Pazartesi");
        System.out.println("Salı");
        System.out.println("Çarşamba");
        System.out.println("Perşembe");
        System.out.println("Cuma");
        System.out.println("Cumartesi");
        System.out.println("Pazar");
        
        System.out.println("-------------------------");
        
        int haftaninGunu = 1;
        if (haftaninGunu==1) {
        	System.out.println("Pazartesi");	
		} else if (haftaninGunu==2) {
			System.out.println("Salı");
		} else if (haftaninGunu==3){
		    System.out.println("Çarşamba");	
		} else if (haftaninGunu==4){
		    System.out.println("Perşembe");	
		} else if (haftaninGunu==5){
		    System.out.println("Cuma");	
		} else if (haftaninGunu==6){
		    System.out.println("Cumartesi");	
		} else if (haftaninGunu==7){
		    System.out.println("Pazar");	
		}
		else {
			System.out.println("Lütfen 1-7 arasında sayı giriniz.");
		}
        System.out.println("------------------------");
        /*
        15-(8-3);
        15-5
        10
        */
        System.out.println(15-(8-3));
        System.out.println("--------------------------");
        
        int b=1, c=2, d=3, e=4;
        int sonuc = (((b*2*e) + (c*3)) / (c+d));
        if (sonuc>25) {
			System.out.println("Evet");
		} else {
			System.out.println("Hayır");
		}
	}
}
