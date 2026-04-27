package net.salesianos.Hotel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Listahoteles {

    private ArrayList<Datos> lista = new ArrayList<>();

    public void add(Datos d) {
        lista.add(d);
    }

    public Datos get(int index) {
        return lista.get(index);
    }

    public void remove(int index) {
        lista.remove(index);
    }

    public int size() {
        return lista.size();
    }

    public ArrayList<Datos> getOrdenados() {
        ArrayList<Datos> copia = new ArrayList<>(lista);
        copia.sort((a, b) -> Integer.compare(b.getPuntuacion(), a.getPuntuacion()));
        return copia;
    }

}
