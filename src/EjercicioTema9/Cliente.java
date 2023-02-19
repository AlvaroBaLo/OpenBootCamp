package EjercicioTema9;

public class Cliente extends Persona {
    int credito;

    public Cliente(){

    }

    public Cliente(int edad, String nombre, String telefono,int credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito=credito;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
