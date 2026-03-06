package com.mycompany.support;

import com.mycompany.support.handler.*;
import com.mycompany.support.model.*;

public class Main {

    public static void main(String[] args) {
        
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();
        SupportHandler level4 = new Level4SupportHandler();

        //Construir correctamente la cadena
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);
        level3.setNextHandler(level4);

        Request r1 = new Request(Priority.BASIC);
        Request r2 = new Request(Priority.INTERMEDIATE);
        Request r3 = new Request(Priority.CRITICAL);
        Request r4 = new Request(Priority.URGENT);

        // Hacer el procesar de las solicitudes
        level1.handleRequest(r1);
        level1.handleRequest(r2);
        level1.handleRequest(r3);
        level1.handleRequest(r4);
        
    }
}
