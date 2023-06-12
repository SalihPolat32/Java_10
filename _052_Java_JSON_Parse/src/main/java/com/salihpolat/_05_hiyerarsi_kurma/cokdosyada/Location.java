package com.salihpolat._05_hiyerarsi_kurma.cokdosyada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

        private String city;
        private String state;
        private String country;
        private int postcode;
        private Street street;
        private Coordinates coordinates;
        private Timezone timezone;
}