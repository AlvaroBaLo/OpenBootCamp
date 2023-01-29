package ejerciciosTema3;

public class Inicio {
    public static void main(String[] args) {
        ejercicioCoche();

        operacionesMath();
    }

    private static void operacionesMath() {

        FuncionesAvanzadas funciones = new FuncionesAvanzadas();

        int param1 = 10;
        int param2 = 5;
        int param3 = 1;

        funciones.suma(param1, param2, param3);
    }

    private static void ejercicioCoche() {
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas.");
    }

}
