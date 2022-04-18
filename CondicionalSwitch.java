public class CondicionalSwitch {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 2;

        int opcion = 2;

        switch(opcion) {
            case 1:
                int suma = num1 + num2;
                System.out.println("Suma: "+ suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("Resta: "+ resta);
                break;
            case 3:
                int multiplicacion = num1 + num2;
                System.out.println("Multiplicación: "+ multiplicacion);
                break;
            case 4:
                int division = num1 / num2;
                System.out.println("División: "+ division);
                break;
            default:
                System.out.println("Opción sin acción");
                break;

        }

    }
}
