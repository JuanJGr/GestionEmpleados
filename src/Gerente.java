public class Gerente extends Empleado {

    protected String equipo;


    public Gerente() {
    }


    public Gerente(String nombre, String id, double salario, String equipo) {
        super(nombre, id, salario);
        this.equipo = equipo;
    }


    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    @Override
    public String toString() {
        return super.toString() + ", Equipo=" + equipo + "]";
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente está supervisando el equipo de " + equipo + ".");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente - Nombre: " + nombre + ", ID: " + id + ", Salario: " + salario + " USD, Equipo: " + equipo);
    }
}

