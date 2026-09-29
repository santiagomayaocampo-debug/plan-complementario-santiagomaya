package modelo;

import java.util.ArrayList;
import java.util.HashMap;

// Aqui se guardan todos los empleados de la app usando un HashMap
public class RepositorioEmpleados {
    private final HashMap<String, EmpleadoBase> empleados = new HashMap<>();

    // Guarda el empleado si la cedula no esta registrada todavia
    public boolean agregar(EmpleadoBase empleado) {
        if (empleados.containsKey(empleado.getCedula())) {
            return false;
        }
        empleados.put(empleado.getCedula(), empleado);
        return true;
    }

    public EmpleadoBase buscar(String cedula) {
        return empleados.get(cedula);
    }

    public boolean actualizar(EmpleadoBase empleado) {
        if (!empleados.containsKey(empleado.getCedula())) {
            return false;
        }
        empleados.put(empleado.getCedula(), empleado);
        return true;
    }

    public boolean eliminar(String cedula) {
        return empleados.remove(cedula) != null;
    }

    public ArrayList<EmpleadoBase> listarTodos() {
        return new ArrayList<>(empleados.values());
    }
}
