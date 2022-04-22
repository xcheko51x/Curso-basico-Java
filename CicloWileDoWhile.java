public class CicloWileDoWhile {
    public static void main(String[] args) {
        
        int contador = 0;

        // Ciclo while
        while(contador < 10) {
            System.out.println("Contador while: "+contador);
            contador++;
            
            if(contador == 5) {
                break;
            }
        }

        contador = 0;

        // Ciclo do while
        do {
            System.out.println("Contador do while: "+contador);
            contador++;
        } while(contador < 10);

    }
}
