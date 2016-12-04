package com.constitution;

import java.awt.*;

public class ConstitutionSystem {

    public static void main(String[] args) {

        // z linii argumentow wczytaj nazwe pliku i numery artykulow uzywajac Buforow

        CommandParser.parse(args);
        Constitution polishConstitution = TextParser.parse(args[0]);


    }



}
