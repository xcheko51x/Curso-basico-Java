/*
Los modificadores de acceso nos introducen al concepto de encapsulamiento. 
El encapsulamiento busca de alguna forma controlar el acceso a los datos que conforman un objeto o instancia, 
de este modo podríamos decir que una clase y por ende sus objetos que hacen uso de 
modificadores de acceso (especialmente privados) son objetos encapsulados.

Los modificadores de acceso permiten dar un nivel de seguridad mayor a nuestras aplicaciones 
restringiendo el acceso a diferentes atributos, métodos, constructores asegurándonos que el usuario deba 
seguir una "ruta" especificada por nosotros para acceder a la información.

*/
public class EjemploModificadoresAcceso {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Sergio", 33, "MX");

        System.out.println(persona.nombre);
        System.out.println(persona.getEdad());
        persona.setEdad(30);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNacionalidad());
    }
}
