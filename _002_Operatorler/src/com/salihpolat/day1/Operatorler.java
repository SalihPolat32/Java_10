package com.salihpolat.day1;

public class Operatorler {
	/*
	 * aritmetik opr.
	 * ilişkisel opr.
	 * bitwise opr.
	 * logic (mantıksal) opr.
	 * atama opr.
	 * 
	 */

	public static void main(String[] args) {
		/*
		int sayi1 = 10;
		int sayi2= 3;
		*/
		int sayi1 = 10, sayi2 = 3;
		
		System.out.println("Aritmetik Operatörler");
		
		// aritmetik opr.
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 - sayi2);
		System.out.println(sayi1 * sayi2);
		System.out.println(sayi1 / sayi2);
		System.out.println(sayi1 % sayi2);
		
		// sayi1 1 artırır
		System.out.println(sayi1++); //10 
		System.out.println(sayi1); //11
		
		sayi1++;
		System.out.println(sayi1); //12
		
		// Yukarıdan aşağı, soldan sağa okur. ++ nerede olduğu önemli.
		
		System.out.println(++sayi2); //4
		System.out.println(sayi2); //4
		
		// sayi1 1 azaltır
		System.out.println(sayi1--); //12
		System.out.println(sayi1); //11
		
		System.out.println(--sayi2); //3
		System.out.println(sayi2); //3
		
	    System.out.println("--------------------");
	    
	    System.out.println("İlişkisel Operatörler");
		
	    // ilişkisel opr. (true - false)
		System.out.println(sayi1 == sayi2); // Eşit mi?
		System.out.println(sayi2 == sayi2); // true
		System.out.println("sayi1 == 3: "+(sayi1 == 3)); // true
		
		System.out.println(sayi2 > sayi1); // false
		System.out.println(sayi2 >= sayi1); // false
		System.out.println(sayi2 >= -20); // true
		
		System.out.println("--------------------");
		
		System.out.println("Bitwise Operatörleri");
		// bitwise opr.
		System.out.println(sayi1 & sayi2);
		System.out.println(sayi1 | sayi2);
		System.out.println(sayi1 ^ sayi2);
		System.out.println(sayi1 << sayi2);
		System.out.println(sayi1 >> sayi2);
		
		System.out.println("--------------------");
			
		System.out.println("Logic (Mantıksal) Operatörleri");
		
		// logic (mantıksal opr.
		boolean a = true; //1
		boolean b = false; //0
		System.out.println(a && b); // çarpma // 0
		System.out.println(a || b); // toplama // 1
				
		System.out.println("--------------------");
		
		System.out.println("Atama Operatörleri");
		
		// atama opr.
		sayi1 = 20;
		/*
		int sonuc = 0;
		sonuc = sayi1 + 5;
		System.out.println(sayi1);
		*/
		
		// sayi1 = sayi1 + 5;
		// System.out.println(sayi1);
		
		System.out.println(sayi1 += 5);
		System.out.println(sayi1 -= 5);
		System.out.println(sayi1 *= 5);
		System.out.println(sayi1 /= 5);
		
		
	}

}
