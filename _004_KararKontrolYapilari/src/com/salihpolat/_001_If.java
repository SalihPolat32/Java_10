package com.salihpolat;

public class _001_If {

	public static void main(String[] args) {
		
		if (1>0) {
			System.out.println("1. Evet Doğru");
		}
		if (1>25) { // Ölü kod
			System.out.println("2. Evet Doğru");			
		}
		int a=3;
		if (a>25) { // a nın değişme ihtimali olduğu için ölü kod sayılmaz
			System.out.println("3. Evet Doğru");			
		}
		int x, y, z;
		x=10;
		y=15;
		z=25;
		// parantez içi - 
		// çarpma ya da bölme - öncelik soldan sağa
		//toplama ya da çıkarma - öncelik soldan sağa
		//   25  > -10
		if ((x+y)>(y-z)) { // İkili şart
			System.out.println("4. Evet Doğru");
		}
	}
}
