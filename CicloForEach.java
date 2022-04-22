public class CicloForEach {
    public static void main(String[] args) {
        
        String[] arregloNombres = {"Luis", "Ana", "Pedro", "Laura", "Jose", "Maria"};
    
        for(int i = 0 ; i < arregloNombres.length ; i++) {
            System.out.println("for: El nombre es: "+arregloNombres[i]);
        }
        
        for (String nombre : arregloNombres) {
            System.out.println("for each: El nombre es: "+nombre);
        }

    }
}
