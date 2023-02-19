package EjercicioTema9;

public class PersonaMain {
    public static void main(String[] args) {

        Persona persona= new Persona(25,"Alvaro","666555444");
        System.out.println(persona.toString());

        Cliente cliente=new Cliente(30,"Alfredo","666777888",50000);
        System.out.println(cliente.toString());

        Trabajador trabajador=new Trabajador(21,"Ignacio","666999333",30000);
        System.out.println(trabajador.toString());











    }
}
