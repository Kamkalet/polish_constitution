package com.constitution;

import java.awt.*;
import java.io.IOException;

public class ConstitutionSystem {

    public static void main(String[] args) {

        // z linii argumentow wczytaj nazwe pliku i numery artykulow uzywajac Buforow

        Constitution polishConstitution = null;
        try {
            polishConstitution = TextParser.parse(args[0]);
        } catch (IOException szkodnik){

            szkodnik.printStackTrace();

        }


        Service service = new Service(polishConstitution);

        service.parse(args);


    }



}
