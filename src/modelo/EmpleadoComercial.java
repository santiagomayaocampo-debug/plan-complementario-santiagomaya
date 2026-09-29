package modelo;

// Clase nueva para los vendedores que ganan una comision por porcentaje
public class EmpleadoComercial extends EmpleadoBase {
    private double porcentajeComision;

    public EmpleadoComercial(String cedula, String nombre, double salarioBase, double porcentajeComision) {
        super(cedula, nombre, salarioBase); // Enviamos los datos al padre
        this.porcentajeComision = porcentajeComision;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    // Formula del ejercicio para calcular el porcentaje de comision sobre el sueldo
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (getSalarioBase() * (porcentajeComision / 100.0));
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }
}
