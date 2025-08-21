import javax.swing.*;

import Controlador;
import Usuario;

import java.util.List;

public class AppGUI {
    private Controlador controller;

    public AppGUI(Controlador controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        while (true) {
            String[] opciones = {"Registrar Usuario", "Reservar Cancha", "Ver Reservas", "Salir"};
            String opcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Menú Principal",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == null || opcion.equals("Salir")) break;

            switch (opcion) {
                case "Registrar Usuario":
                    registrarUsuario();
                    break;
                case "Reservar Cancha":
                    reservarCancha();
                    break;
                case "Ver Reservas":
                    verReservas();
                    break;
            }
        }
    }

    private void registrarUsuario() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String correo = JOptionPane.showInputDialog("Correo:");
        String cargo = JOptionPane.showInputDialog("Cargo:");
        Usuario u = new Usuario(controller.getReservas().size() + 1, nombre, correo, cargo);
        controller.registrarUsuario(u);
        JOptionPane.showMessageDialog(null, "Usuario registrado:\n" + u);
    }

    private void reservarCancha() {
        List<Cancha> disponibles = controller.getCanchasDisponibles();
        if (disponibles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay canchas disponibles.");
            return;
        }

        Cancha canchaSeleccionada = (Cancha) JOptionPane.showInputDialog(
                null,
                "Seleccione una cancha:",
                "Canchas Disponibles",
                JOptionPane.QUESTION_MESSAGE,
                null,
                disponibles.toArray(),
                disponibles.get(0)
        );

        String fecha = JOptionPane.showInputDialog("Fecha (dd/mm/aaaa):");
        String hora = JOptionPane.showInputDialog("Hora (HH:mm):");

        Usuario Robert_Pattinson = new Usuario(999, "Robert Pattinson", "mia@correo.com", "Cliente");
        Reserva r = controller.crearReserva(Robert_Pattinson, canchaSeleccionada, fecha, hora);

        JOptionPane.showMessageDialog(null, "Reserva creada:\n" + r);
    }

    private void verReservas() {
        StringBuilder sb = new StringBuilder("Reservas actuales:\n");
        for (Reserva res : controller.getReservas()) {
            sb.append(res).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
