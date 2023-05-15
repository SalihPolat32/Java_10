package com.salihpolat;

public class _004_WhileDongusu_DoWhileDongusu {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		System.out.println("-------FOR----------");
		/*
		for (int i : sayilar) {
			
		}
		*/
		int j = 0;
        while (j<10) {
        	System.out.println(j);
        	j++;
			
		}
        System.out.println("----------While-----------");
        /*
        int a = 0;
        while (true) {
        	a++;
        	System.out.println(a);
        }
        System.out.println("-----------SONSUZ DÖNGÜ----------");
        */
        /*
        for (int i = 0; true; i++) {
			System.out.println(i);
		
		for (; ; ) {
			System.out.println("Kralını Tanımam.);
			
		}
		System.out.println("-------FOR İLE SONSUZ DÖNGÜ----------");
		*/
        // Üstte sonsuz olduğu için alt koda hiçbir zaman geçmez.
        
        System.out.println("-------While Döngüsü------");
        int a = 0;
        while (a < 10) {
        	System.out.println(a);
        	a++;
        }
        System.out.println("-------Do While Döngüsü------");
        int b = 0;
        do {
			System.out.println(b);
			b++;
		} while (b < 10);
        // Do While en az bir kere çalıştırır döngüyü
        // While sağlamıyorsa çalışmaz
	}

}
