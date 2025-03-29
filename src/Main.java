public class Main {
    public static void main(String[] args) {

        /*En este ejercicio, se crea un proyecto en el cual se manejarán diferentes
        tipos de trabajadores dentro de una organización. La idea es implementar un
         sistema que permita gestionar empleados de distintos roles, como desarrolladores,
         diseñadores y gerentes, utilizando conceptos de clases abstractas e interfaces en
         Java. */


        Desarrollador desarrollador = new Desarrollador("Ana", "D001", 4000, "Java");
        desarrollador.trabajar();
        desarrollador.mostrarInfo();
        desarrollador.descansar();
        desarrollador.recibirSalario();


        Diseñador diseñador = new Diseñador("Carlos", "S002", 2000, "Photoshop");
        diseñador.trabajar();
        diseñador.mostrarInfo();
        diseñador.descansar();
        diseñador.recibirSalario();


        Gerente gerente = new Gerente("María", "G003", 8000, "Desarrollo");
        gerente.trabajar();
        gerente.mostrarInfo();
        gerente.descansar();
        gerente.recibirSalario();
    }
}
