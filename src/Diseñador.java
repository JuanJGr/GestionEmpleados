public class Diseñador extends Empleado {

    protected String herramienta;

    public Diseñador() {
    }


    public Diseñador(String nombre, String id, double salario, String herramienta) {
        super(nombre, id, salario);
        this.herramienta = herramienta;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Herramienta=" + herramienta + "]";
    }

    @Override
    public void trabajar() {
        System.out.println("El diseñador está trabajando en " + herramienta + ".");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Diseñador - Nombre: " + nombre + ", ID: " + id + ", Salario: " + salario + " USD, Herramienta: " + herramienta);
    }
}
