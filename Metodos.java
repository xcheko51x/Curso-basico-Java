/* METODOS

Un método en Java es un conjunto de instrucciones definidas dentro de una clase, 
que realizan una determinada tarea y a las que podemos invocar mediante un nombre.

*/

public class Metodos {
    public static void main(String[] args) {
        
        suma();

        int resultadoResta = resta();
        System.out.println("Resta: "+resultadoResta);

        multiplicacion(10, 2);

        int resultadoDivision = division(10, 2);
        System.out.println("Division: "+resultadoDivision);
    }

    // Metodos que no reciben parametros ni regresan algun valor
    public static void suma() {
        int num1 = 10;
        int num2 = 2;
        System.out.println("Suma: "+num1+" + "+num2+" = "+(num1+num2));
    }

    // Metodos que no reciben parametros y regresan algun valor
    public static int resta() {
        int num1 = 10;
        int num2 = 2;
        int resultado = num1 -  num2;
        return resultado;
    }

    // Metodos que reciben parametros y no regresan algun valor
    public static void multiplicacion(int num1, int num2) {
        System.out.println("Multplicacion: "+num1+" * "+num2+" = "+(num1*num2));
    }

    // Metodos que reciben parametros y regresan algun valor
    public static int division(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }
}
