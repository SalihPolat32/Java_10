package com.salihpolat;

public class MyString {

	public static void main(String[] args) {
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);			
		}
		
		System.out.println("\n---------------------------");
		
		String alfabe = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabe.toUpperCase());
		System.out.println(alfabe.length());
		
        System.out.println("\n---------------------------");
		
		String alfabe1 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabe1);
		
		System.out.println("\n---------------------------");
		
		String alfabe2 = "ABCDEFGHİJKLMNOPQRSTUVWXYZ";
		System.out.println(alfabe2);
		
		String adi = "Ali GÜNEŞ";
		System.out.println(adi);
		
		System.out.println("\n---------------------------");
		
		String duzYazi = """
				
				Arasına istediğimiz bir şey paragraf olarak ekleyebiliriz. Üç tane koyarak.
				
				""";
		System.out.println(duzYazi);
		
		System.out.println("\n---------------------------");
		
		System.out.println(alfabe == alfabe1);
		System.out.println(alfabe == duzYazi);
		System.out.println(alfabe.charAt(25));

	}
}