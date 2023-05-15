import java.time.*;
import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }

        System.out.println("----------------------------");

        String str1 = "abc";
        System.out.println(str1.startsWith("t")); // false
        System.out.println(str1.endsWith("c")); // true

        System.out.println(str1.contains("b")); // true // içinde herhangi bir yerde b var mı?

        String personelAdi = " Mehmet Caner ";
        System.out.println(personelAdi);
        System.out.println(personelAdi.trim());

        var adi = "Ahmet AKKOYUN";
        System.out.println(adi.toUpperCase()); // var joker eleman gibi farklı türler yerine kullanılabilir

        var yasi = 25;
        System.out.println(yasi); // Üsteki gibi string görmedi.

        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());

        var piSayisi = 3.1423568468468468468;
        System.out.format("%.2f", piSayisi);

        // Bir metotun içinde bir iş yap çoklu yapma.

        System.out.println("----------------------------");

        var x = "Ali";
        var y = "Ali";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println("----------------------------");

        String z = "Ali";
        System.out.println(x == z);
        System.out.println(x.equals(z));

        System.out.println("----------------------------");

        String n = new String("Ali");
        System.out.println(x == n); // Hem içteki değere bakar, hem de adrese bakar. Adreslerde aynı olmak zorundadır.
        System.out.println(x.equals(n)); // İçteki değerine bakar

        System.out.println("----------------------------");

        System.out.println(" " + 1 + 2); //  12 -> ilk string gördüğü için gerisini de string görür
        System.out.println(1 + " " + 2 + 3); // 1 23 -> string gördükten sonra stringe döner
        System.out.println(1 + 2 + " " + 4 + 5); // 3 45 -> string görmediği için sayısal toplama yapar devamında string yapınca devam eder

        System.out.println(" " + (1 + 2)); //  3
        System.out.println(1 + " " + (2 + 3)); // 1 5
        System.out.println((1 + 2) + " " + 4 + 5); // 3 45

        System.out.println("----------------------------");

        String[] hayvanlar = {"Deve", "Maymun", "Aslan", "Kaplan"};
        System.out.println(hayvanlar.length);

        System.out.println(hayvanlar[0]); // Deve
        hayvanlar[0] = "Kedi";
        System.out.println(hayvanlar[0]); // Kedi

        System.out.println("----------------------------");

        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);
        }

        System.out.println("----------------------------");

        Arrays.sort(hayvanlar); // Alfabetik Sıralama Yaptı.
        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);
        }

        System.out.println("----------------------------");

        int[] myArr1;
        int [] myArr2;
        int []myArr3;
        int myArr4[];
        int myArr5 [];

        int[][] my2DArr1;
        int [][] my2DArr2;
        int [][]my2DArr3;
        int my2DArr4[][];
        int my2DArr5 [][];
        int [] my2DArr6 [];
        int[] my2DArr7[];
        int []my2DArr8[];
        int[] my2DArr9 [];
        int [] my2DArr10 [];

        int [][] my3DArr1 [];
        int [] my3DArr2 [][];
        int my3DArr3 [][][];
        int [][][] my3DArr4;

        int myArrLast1[], myArrLast2[][], myArrLast3[][][];

        int myArrLast4[];
        int myArrLast5[][];
        int myArrLast6[][][];

        var simdi = Instant.now();
        System.out.println(simdi);

        var simdi2 = Instant.now();
        System.out.println(simdi2);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var tarih1 = LocalDate.of(2023,Month.MAY,10);
        System.out.println(tarih1);

        var tarih2 = LocalDate.of(2023,5, 10);
        System.out.println(tarih2);

        System.out.println(tarih1.plusDays(32));
        System.out.println(tarih1.minusMonths(3).minusDays(10));

    }
}