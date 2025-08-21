import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Cancha> canchas = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario u) {
        if (!usuarios.contains(u)) {
            usuarios.add(u);
        }
    }

    public void agregarCancha(Cancha c) {
        canchas.add(c);
    }

    public List<Cancha> getCanchasDisponibles() {
        List<Cancha> libres = new ArrayList<>();
        for (Cancha c : canchas) {
            if (c.isDisponible()) libres.add(c);
        }
        return libres;
    }

    public Reserva crearReserva(Usuario u, Cancha c, String fecha, String hora) {
        if (!c.isDisponible()) {
            throw new IllegalArgumentException("La cancha no está disponible.");
        }
        int id = reservas.size() + 1;
        Reserva r = new Reserva(id, u, c, fecha, hora, c.getCostoHora());
        reservas.add(r);
        c.setDisponibilidad(false);
        return r;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
