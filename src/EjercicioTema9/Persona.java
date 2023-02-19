package EjercicioTema9;

public class Persona {

      int edad;
      String nombre;
      String telefono;
      public Persona (){

      }

      public Persona(int edad, String nombre, String telefono) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
      }

      @Override
      public String toString() {
            return "Persona{" +
                    "edad=" + edad +
                    ", nombre='" + nombre + '\'' +
                    ", telefono='" + telefono + '\'' +
                    '}';
      }
}
