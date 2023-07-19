package com.salihpolat;

import java.util.UUID;

public class DemoUuid {

    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();

        System.out.println(uuid);

        // ************************************************

        System.out.println(uuid.toString());

        // ************************************************

        System.out.println(UUID.randomUUID());
    }
}