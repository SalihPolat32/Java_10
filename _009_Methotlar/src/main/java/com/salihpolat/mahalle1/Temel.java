package com.salihpolat.mahalle1;

import com.salihpolat.mahalle2.B;

class A1 { // Birden fazla class açılabilir.
}

public class Temel { // Class'larda bir tane public kullanılır. Ev sahibi alır.

    // Erişim Belirteçleri - Metotlarda ve Classlarda kullanılabilir.
    // public // Nerede Olduğu Fark Etmez
    // (  ) (default) (Boş) // Aynı Pakette Olması Lazım
    // protected // Miras
    // private // Sadece O Sınıfa Özel

    // staticte nesne çağırmamıza gerek yok

    public static void main(String[] args) {

        A obj = new A();
        obj.goster();

        B obj2 = new B(); // Farklı pakette olsa da public olursa kullanılır
        obj2.goster();

    }
}
