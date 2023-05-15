package com.salihpolat.day2;

import java.util.Scanner;

public class MyApp2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Bir Sayı Giriniz: ");
		int i = scanner.nextInt();
		System.out.println("Sonuç: "+i*5);
		
		System.out.println("---------------------");
		
		System.out.print("Lütfen Virgüllü Bir Sayı Giriniz: ");
		float myValue = scanner.nextFloat();
		System.out.println("Sonuç: "+myValue*1.5);
		
		System.out.println("---------------------");
		
		System.out.print("Lütfen Virgüllü Bir Sayı Giriniz: ");
		double i1 = scanner.nextDouble();
		System.out.println("Sonuç: "+i1*5);
	}

}
