package com.salihpolat.ornekler;

import java.util.logging.SocketHandler;

public class MethotCagirilari {

    public static void main(String[] args) {

        kulaklık();

    }

    private static void kulaklık() {

        System.out.println("Kulaklık");
        sagKulaklık();
        solKulaklık();
    }

    private static void sagKulaklık() {
        System.out.println("Sağ Kulaklık");
    }
    private static void solKulaklık() {
        System.out.println("Sol Kulaklık");
    }
}
