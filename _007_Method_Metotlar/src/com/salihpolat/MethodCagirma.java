package com.salihpolat;

public class MethodCagirma {
	
	/*
	void selamVer(String adi) {
		System.out.println("Selam Ver Methodu. Sayın "+adi+" Merhaba");
	}
	*/
	
	String selamVer(String adi) {
		return "Sayın "+adi+" Merhaba";
	}
	
	void selamAl (){
		System.out.println("Selam Al Methodu");
	}
	
	public static void main(String[] args) {
		
		MethodCagirma obj = new MethodCagirma();
		obj.selamAl();
		
		System.out.println(obj.selamVer("Ali")+"Ooooooo Kralsınız");
		
		String sonuc = obj.selamVer("Aminenur");
		System.out.println(sonuc);
		
		String kampanya = "Size özel indirim kampanyaları var."+obj.selamVer("Orhun");
		System.out.println(kampanya);
		
	}
}