package com.salihpolat.ders1;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		
		// Sabit ve değişmeyecek şeyler dizi olur. Ekleme çıkarma yapılamaz.
		
		// int [] myNumbers = new int [3];
		// int [] myNumbers = {8, 44, 55};
		/*
		int [] sayi new int[4];
		
		sayi[0] = 12;
		sayi[1] = 14;
		sayi[2] = 15;
		sayi[3] = 22;
		 */
		
		int [][] myNumbers = new int [3][5];
		
		myNumbers[0][1] = 10;
		myNumbers[0][1] = 15;
		myNumbers[0][2] = 20;
		myNumbers[0][3] = 8;
		myNumbers[0][4] = 9;
		
		int [][] myArray2 = {{10, 20, 30}, {10, 12, 40}, {50, 70, 90}};
		for (int i = 0; i < myArray2.length; i++) {
			
			for (int j = 0; j < myArray2.length; j++) {
				System.out.print (myArray2[i][j]+" "); // i satır j sutün
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		int [][] myArray3 = {{10, 20, 30, 11}, {10, 12, 40, 65}, {50, 70, 90, 77}};
		for (int i = 0; i < myArray3.length; i++) { // Satır
			
			for (int j = 0; j < myArray3[i].length; j++) { //Sutün // İç içe olan döngülerde myArray3[i].length içine i koymak zorundayız tablo sayıları eşit olmadığı için.
				System.out.print (myArray3[i][j]+" ");
			}
			System.out.println();
		}
        System.out.println("-----------------------");
		                //           0. Satır        1. Satır     2. Satır          3. Satır 
		Integer [][] myArray4 = {{10, 20, 30, 11, null}, {}, {10, 12, 40, 65, 66}, {50, 70, 90}}; // int olsa null yazılamazdı.
		
		// System.out.println(myArray4[3][2]);
		for (int i = 0; i < myArray4.length; i++) {
			
			for (int j = 0; j < myArray4[i].length; j++) { // myArray4[i].length içindeki i en önemli yer !!!
				System.out.print (myArray4[i][j]+" ");
				// null " " ' ' boşluk hepsinin anlamı farklı
			}
			System.out.println();
		}
	}
}