package net.salesianos.utilidades;

import javax.swing.*;

public class Utilidades {

    public static String pedirTexto(String mensaje) {
        String txt;
        do {
            txt = JOpetionPane.showInputDialog(mensaje);
            if (txt == null)
                return null;
        } while (txt.isBlank());
        return txt;
    }

}
