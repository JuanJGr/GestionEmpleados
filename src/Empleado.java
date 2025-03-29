public abstract class Empleado implements Trabajable {
    protected String nombre;
    protected String id;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", id=" + id + ", salario=" + salario + "]";
    }


    public void descansar() {
        System.out.println(nombre + " está descansando...");
    }

    public void recibirSalario() {
        System.out.println(nombre + " ha recibido un salario de: " + salario + " USD.");
    }

    public abstract void mostrarInfo();
}
