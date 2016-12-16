package com.constitution;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConstitutionSystem {

    public static void main(String[] args) {

        // z linii argumentow wczytaj nazwe pliku i numery artykulow uzywajac Buforow

        Constitution polishConstitution = null;

        polishConstitution = TextParser.parse(args[0]);


        try {

            Service service = new Service(polishConstitution);

            service.parse(args);

        } catch ( IllegalArgumentException exception){

            System.out.println("Niewlasciwe dane wejsciowe");

        }


    }



}
