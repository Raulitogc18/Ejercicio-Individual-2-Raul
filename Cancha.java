public class Cancha {
    private int id;
    private String tipo;
    private int capacidad;
    private int costoHora;
    private boolean disponible = true;

    public Cancha(int id, String tipo, int capacidad, int costoHora) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.costoHora = costoHora;
    }

    public boolean setDisponibilidad(boolean estado) {
        this.disponible = estado;
        return this.disponible;
    }

    public boolean isDisponible() { return disponible; }
    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public int getCapacidad() { return capacidad; }
    public int getCostoHora() { return costoHora; }

    @Override
    public String toString() {
        return "Cancha " + id + " (" + tipo + ") - Cap: " + capacidad + " - Q" + costoHora + "/h " +
            (disponible ? "[Disponible]" : "[Ocupada]");
    }
}
