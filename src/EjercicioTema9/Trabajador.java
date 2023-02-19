package EjercicioTema9;

public class Trabajador extends Persona{
    int Salario;

    public Trabajador(){

    }
    public Trabajador(int edad, String nombre, String telefono, int Salario){
        this.nombre=nombre;
        this.edad=edad;
        this.telefono=telefono;
        this.Salario=Salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "Salario=" + Salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
