package modelo;

// Esta es la clase padre que tiene los datos basicos de cualquier empleado
public class EmpleadoBase {
    private final String cedula;
    private String nombre;
    private double salarioBase;

    // Constructor para rellenar los datos obligatorios
    public EmpleadoBase(String cedula, String nombre, double salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        setSalarioBase(salarioBase);
    }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public double getSalarioBase() { return salarioBase; }

    // Setter que no deja poner salarios en negativo
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

    // Metodos que seran cambiados por las clases hijas
    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public String getTipo() {
        return "Operativo";
    }
}
