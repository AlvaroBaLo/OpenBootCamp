package EjerciciosTema4;

public class Inicio {
    public static void main(String[] args) {
    EjercicioCondicionales.ejercicioIf();
    EjercicioBucles.exeWhile();
    EjercicioBucles.exeDoWhile();
    EjercicioBucles.exeFor();
    EjercicioSwitch();
    }

    private static void EjercicioSwitch() {
        var estacion = "Hola";
        switch(estacion)    {
            case "Verano":
                System.out.println("Hace calor");
                break;
            case "Invierno":
                System.out.println("Hace frío");
                break;
            case "Otoño":
                System.out.println("Recogeremos setas");
                break;
            case "Primavera":
                System.out.println("Tendré alergia");
                break;
            default:
                System.out.println("No has escrito ninguna estación");
        }
    }
}

