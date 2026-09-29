import controlador.EmpleadoControlador;
import vista.VentanaEmpleados;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        // Iniciamos la interfaz de manera limpia usando invokeLater
        SwingUtilities.invokeLater(() -> {
            EmpleadoControlador controlador = new EmpleadoControlador();
            VentanaEmpleados ventana = new VentanaEmpleados(controlador);
            ventana.setVisible(true);
        });
    }
}
