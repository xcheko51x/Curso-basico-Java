/*
En programación orientada a objetos, polimorfismo es la capacidad que tienen los objetos de una clase 
en ofrecer respuesta distinta e independiente en función de los parámetros (diferentes implementaciones) 
utilizados durante su invocación. 
Dicho de otro modo el objeto como entidad puede contener valores de diferentes tipos durante la ejecución del programa.
*/

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        
        sumaNumeros(10, 15);
        sumaNumeros(5, 15, 5);

        Sumas.sumas();
        Sumas.sumas(10, 10, 25, 10);

    }

    public static void sumaNumeros(int num1, int num2) {
        System.out.println("Suma Metodo 2 parametros"+num1+" + "+num2+" = "+(num1+num2));
    }

    public static void sumaNumeros(int num1, int num2, int num3) {
        System.out.println("Suma Metodo 3 parametros"+num1+" + "+num2+" + "+num3+" = "+(num1+num2+num3));
    }
}

class Sumas {

    public static void sumas() {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Suma Clase sin parametros"+num1+" + "+num2+" = "+(num1+num2));
    }

    public static void sumas(int num1, int num2, int num3, int num4){
        System.out.println("Suma Clase 4 parametros"+num1+" + "+num2+" + "+num3+" + "+num4+" = "+(num1+num2+num3+num4));
    }
}
