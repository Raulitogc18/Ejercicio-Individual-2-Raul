public class Main {
    public static void main(String[] args) {
        Controlador controller = new Controlador();
        controller.agregarCancha(new Cancha(1, "Futbol", 22, 500));
        controller.agregarCancha(new Cancha(2, "Basketball", 10, 300));
        controller.agregarCancha(new Cancha(3, "Tenis", 4, 200));

        AppGUI gui = new AppGUI(controller);
        gui.mostrarMenu();
    }
}
