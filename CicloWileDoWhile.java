public class CicloWileDoWhile {
    public static void main(String[] args) {
        
        int contador = 10;

        // Ciclo while
        while(contador < 5) {
            System.out.println("Contador while: "+contador);
            contador++;
        }

        contador = 10;

        // Ciclo do while
        do {
            System.out.println("Contador do while: "+contador);
            contador++;
        } while(contador < 5);

    }
}
