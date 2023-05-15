package com.salihpolat;

public class Hello implements IHello, IDeneme { // İki tane İnterface Ekledik.

	public static void main(String[] args) {
		
		Hello objHello = new Hello();
		objHello.selamVer();
		
		objHello.kural3("Burak DELİCE");
		
	}

	@Override
	public void selamVer() {
		System.out.println("Selamlar Güzel İnsanlar");
	}

	@Override
	public void kural2() {
		
		
		
	}

	@Override
	public void kural3(String mesaj) {
		
		System.out.println("Kural 3: "+mesaj);
	}

	@Override
	public void adiniziYaz() {
		// TODO Auto-generated method stub
		
	}
}