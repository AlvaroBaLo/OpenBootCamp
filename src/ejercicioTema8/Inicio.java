package ejercicioTema8;

public class Inicio {
    public static void main(String[] args) {

    EjercicioPersona ep = new EjercicioPersona();
    ep.setEdad(25);
    ep.setNombre("Álvaro");
    ep.setTelefono("666555444");

    System.out.println("A nombre de " + ep.getNombre());
    System.out.println("Con edad:  " + ep.getEdad());
    System.out.println("Telefono de contacto " + ep.getTelefono());

        System.out.println(ep.toString());
    }

}

