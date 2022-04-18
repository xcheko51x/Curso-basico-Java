public class CicloFor {
    public static void main(String[]args) {
        
        for(int i = 0 ; i <= 10 ; i++) {
            System.out.println("Contador i: " + i);
        }

        // El ciclo for se usa comunmente para recorrer arreglos o listas
        int arreglo[] = new int[]{100,200,300,400,500};
        
        for(int i = 0 ; i < arreglo.length ; i++) {
            System.out.println("Contador i: " + i + " Valor arreglo["+i+"]: "+arreglo[i]);
        }
    }
}
