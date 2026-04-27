package net.salesianos.Hotel;

public class Datos {

    private String Nombre;
    private int Estrellas;
    private int Puntuacion;
    private int Precio;
    private String Ubicacion;

    public Datos(String Nombre, int Estrellas, int Puntuacion, int Precio, String Ubicacion) {
        this.Nombre = Nombre;
        this.Estrellas = Estrellas;
        this.Puntuacion = Puntuacion;
        this.Precio = Precio;
        this.Ubicacion = Ubicacion;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    @Override
    public String toString() {
        return "El hotel: " + Nombre + " tiene " + Estrellas + " estrellas, su puntuacion es de " + Puntuacion
                + " con un precion de " + Precio + "€ por noche, y esta ubicado en: " + Ubicacion;
    }
}
