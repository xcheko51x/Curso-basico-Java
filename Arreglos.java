public class Arreglos {
    public static void main(String[] args) {
        
        String[] semana = new String[]{"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        // Mostrar arreglo
        for (int i = 0 ; i < semana.length ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana[i]);
        }

        // Acceso a los campos del arreglo
        System.out.println("EL lugar 3 corresponde a: " + semana[3]);

        // Modificar datos en el arreglo
        semana[0] = "Enero";

        for (int i = 0 ; i < semana.length ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana[i]);
        }
    }
}
