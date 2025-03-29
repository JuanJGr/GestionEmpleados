public class Desarrollador extends Empleado {

    protected String lenguaje;


    public Desarrollador() {
    }

    public Desarrollador(String nombre, String id, double salario, String lenguaje) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lenguaje=" + lenguaje + "]";
    }

    @Override
    public void trabajar() {
        System.out.println("El desarrollador está programando en " + lenguaje + ".");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Desarrollador - Nombre: " + nombre + ", ID: " + id + ", Salario: " + salario + " USD, Lenguaje: " + lenguaje);
    }
}

