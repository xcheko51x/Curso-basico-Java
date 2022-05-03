public class Persona {
    // Tiene acceso en todas partes
    String nombre;

    // Para acceder solo se puede definiendo los get y set dentro de la clase
    private int edad;

    // Para acceder es por medio de get y set pero se pueden definir desde la clase padre o las subclases
    protected String nacionalidad;

    Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}

class Trabajador extends Persona {

    Trabajador(String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}