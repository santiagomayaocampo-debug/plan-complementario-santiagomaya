package modelo;

// Clase hija para los empleados de oficina que ganan un bono extra
public class EmpleadoAdministrativo extends EmpleadoBase {
    private double bonificacion;

    public EmpleadoAdministrativo(String cedula, String nombre, double salarioBase, double bonificacion) {
        super(cedula, nombre, salarioBase); // Mandamos los datos a la clase padre
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    // Sobrescribimos para sumarle la bonificacion al sueldo base
    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + bonificacion;
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }
}
