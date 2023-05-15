package com.salihpolat;

public class _006_Continue {

	public static void main(String[] args) {
		// comtinue döngünün en başına git
		for (int i = 0; i < 25; i++) {
			// 20'yi bul dngünün başına git
			//continue;
			//break;
			if (i == 20) {
				System.out.println("20'yi buldum.");
				continue; // 7. satıra götürür. Döngü devam eder. Başa döner.
				// break 20.satıra götürür. Döngüyü kırar ve çıkar.
				} else {
					System.out.println(i);
			}
			
		}
		// break döngünün sonuna gider
	}

}
