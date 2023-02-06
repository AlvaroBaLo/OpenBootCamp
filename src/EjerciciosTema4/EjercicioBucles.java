package EjerciciosTema4;

public class EjercicioBucles {

    public static void exeWhile() {
        EjercicioBucles ejercicioWhile = new EjercicioBucles();
        int contador = 0;
        while (contador < 3) {
            System.out.println(contador);
            contador++;
        }
    }

    public static void exeDoWhile() {
        EjercicioBucles ejercicioDoWhile = new EjercicioBucles();
        int contador = 3;
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 3);
    }

    public static void exeFor() {
        for (int numero = 0; numero <= 3; numero++) {
            System.out.println(numero);
        }
    }
}

