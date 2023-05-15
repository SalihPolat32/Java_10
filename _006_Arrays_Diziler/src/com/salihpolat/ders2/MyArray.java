package com.salihpolat.ders2;

import java.util.Random;

public class MyArray {

	public static void main(String[] args) {

		int[][] myArr = new int[3][3];

		myArr[0][0] = 123;
		myArr[2][1] = 33;

		// myArr[4][4] = 55; // ArrayIndexOutOfBoundsException Hatası Verir.

		System.out.println("---------------- 2D Array ------------------");

		int satir = 8;
		int kolon = 6;

		int[][] yourArr = new int[satir][kolon];

		Random randomNumber = new Random();

		for (int i = 0; i < satir; i++) { // Satır

			for (int j = 0; j < kolon; j++) { // Sütun

				yourArr[i][j] = randomNumber.nextInt(100);

			}
		}
		for (int i = 0; i < satir; i++) { // Satır

			for (int j = 0; j < kolon; j++) { // Sütun

				System.out.print(yourArr[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println("---------------- 3D Array ------------------");
		
		int[][][] yourArr3d = new int[6][4][3];
		
		/*
		yourArr3d[0][0][0] = 88;
		yourArr3d[0][0][1] = 55;
		yourArr3d[0][0][2] = 77;
		*/
		
		for (int i = 0; i < 6; i++) { // Table - Tablo
			for (int j = 0; j < 4; j++) { // Row - Satır
				for (int k = 0; k < 3; k++) { // Column - Sütun - Kolon
					yourArr3d[i][j][k] = randomNumber.nextInt(2000);
				}
			}
		}		
		for (int i = 0; i < yourArr3d.length; i++) {
			System.out.println("\nTablo No: "+(i+1));
			for (int j = 0; j < yourArr3d[i].length; j++) {
				for (int k = 0; k < yourArr3d[i][j].length; k++) {
					System.out.print(yourArr3d[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
	}
}