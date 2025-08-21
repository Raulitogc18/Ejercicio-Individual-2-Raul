public class Reserva {
    private int idReserva;
    private Usuario usuario;
    private Cancha cancha;
    private String fecha;
    private String hora;
    private int costo;
    private String estado;

    public Reserva(int idReserva, Usuario usuario, Cancha cancha, String fecha, String hora, int costo) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.cancha = cancha;
        this.fecha = fecha;
        this.hora = hora;
        this.costo = costo;
        this.estado = "CONFIRMADA";
    }

    public int getIdReserva() { return idReserva; }
    public Usuario getUsuario() { return usuario; }
    public Cancha getCancha() { return cancha; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public int getCosto() { return costo; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Reserva " + idReserva + " - " + cancha + " - " + fecha + " " + hora + " - Estado: " + estado;
    }
}
