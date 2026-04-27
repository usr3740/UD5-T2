package net.salesianos.utilidades;

import javax.swing.*;

public class Utilidades {

    public static String pedirTexto(String mensaje) {
        String txt;
        do {
            txt = JOptionPane.showInputDialog(mensaje);
            if (txt == null)
                return null;
        } while (txt.isBlank());
        return txt;
    }

    public static int pedirEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null)
                    return -1;
                return Integer.parseInt(input);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Introduce un numero valido");
            }
        }
    }

    public static int PedirPuntuacion() {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Puntuación del 1 al 5: ");
                if (input == null)
                    return -1;
                int p = Integer.parseInt(input);
                if (p >= 1 && p <= 5)
                    return p;
            } catch (Exception ignored) {
            }
            JOptionPane.showConfirmDialog(null, "Introduce un numero del 1 al 5");

        }
    }

}