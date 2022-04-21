/*
    TIPOS DE DATOS PRIMITIVOS EN JAVA
        byte    : Es un tipo de dato de 8 bits con signo. (-128 a 127)
        short   : Es un tipo de dato de 16 bits con signo. (-32,768 a 32767)
        int     : Es un tipo de dato de 32 bits con signo. ((-2^31) a (2^31)-1)
        long    : Es un tipo de dato de 64 bits con signo. ((-2^63) a (2^63)-1)
        float   : Es un tipo de dato para almacenar números en coma flotante con precisión simple de 32 bits
        double  : Es un tipo de dato para almacenar númers en coma flotante con doble precisión de 64 bits
        boolean : Sirve para definir tipos de datos booleanos, es decir valores true o false
        char    : Es un tipo de dato que representa un caracter unicode sencillo de 16 bits
*/

public class TiposDatos {
    public static void main(String[]args) {

        // Fuertemente Tipado
        String nombre = "xcheko51x";
        int numero = 10;
        boolean esReal = true;
        float numeroDecimal = 50.0f;
        double precio = 152.00;

        // CASTEO
        /* 
            CASTEO IMPLÍCITO

            El casteo implícito radica en que no se necesita escribir código para que se lleve a cabo. 
            Ocurre cuando se realiza una conversión ancha – widening casting – es decir, 
            cuando se coloca un valor pequeño en un contenedor grande.
        */
        
        int numEntero = 15;
        System.out.println("Tipo numEntero: " + ((Object)numEntero).getClass().getSimpleName());
        long numLargo = numEntero;
        System.out.println("Tipo numLargo: " + ((Object)numLargo).getClass().getSimpleName());
        
        /*
            CASTEO EXPLICITO

            El casteo explicito se produce cuando se realiza una conversión estrecha – narrowing casting – es decir, 
            cuando se coloca un valor grande en un contenedor pequeño. 
            Son susceptibles de perdida de datos y deben realizarse a través de código fuente, de forma explicita.
        */

        int numEntero2 = 200;
        System.out.println("Tipo numEntero2: " + ((Object)numEntero2).getClass().getSimpleName());
        short numShort = (short) numEntero2;
        System.out.println("Tipo numShort: " + ((Object)numShort).getClass().getSimpleName());

        // CONVERSIONES
        String numString = "15";
        int numInt = Integer.parseInt(numString);
        System.out.println("numString: " + (numString + 5));
        System.out.println("numInt: " + (numInt + 5));
    }
}