public class CondicionalIfElse {

    public static void main(String[] args) {
        
        int edad = 64;

        if(edad < 18) {
            System.out.println("La edad " + edad + " es menor a 18 por lo tanto es menor de edad");
        } else if(edad >= 18 && edad < 60) {
            System.out.println("La edad " + edad + " es mayor a 18 y menor a 60 por lo tanto es adulto");
        } else {
            System.out.println("La edad " + edad + " es mayor a 60 por lo tanto es una persona de la tercera edad");
        }
        
    }
    
}
