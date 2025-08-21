public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String cargo;

    public Usuario(int idUsuario, String nombre, String correo, String cargo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.cargo = cargo;
    }

    public int getId() { return idUsuario; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return idUsuario + " - " + nombre + " (" + cargo + ")";
    }
}
