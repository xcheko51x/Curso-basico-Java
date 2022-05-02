/*
Un array Java es una estructura de datos que nos permite almacenar una lista de datos de un mismo tipo. 
0El tamaño de los arrays se declara en un primer momento y no puede cambiar en tiempo de ejecución 
como puede producirse en otros lenguajes.
*/

import java.util.ArrayList;
import java.util.List;

public class Arreglos {
    public static void main(String[] args) {
        
        //usoArray();
        //usoArrayList();
        
    }

    public static void usoArray() {
        String[] semana = new String[]{"Enero", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        // Agregar elemento - ERROR
        //semana[6] = "Sabado";


        // Mostrar arreglo
        for (int i = 0 ; i < semana.length ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana[i]);
        }

        // Acceso a los campos del arreglo
        System.out.println("EL lugar 3 corresponde a: " + semana[3]);

        // Modificar datos en el arreglo
        semana[0] = "Domingo";

        for (int i = 0 ; i < semana.length ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana[i]);
        }
    }

    public static void usoArrayList() {
        List<String> semana = new ArrayList<String>();
        semana.add("Enero");
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");

        // Agregar elemento
        //semana.add("Sabado");

        // Eliminar elemento 
        //semana.remove(0);

        // Mostrar arreglo
        for (int i = 0 ; i < semana.size() ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana.get(i));
        }

        // Acceso a los campos del arreglo
        System.out.println("EL lugar 3 corresponde a: " + semana.get(3));

        // Modificar datos en el arreglo
        semana.set(0, "Domingo");

        for (int i = 0 ; i < semana.size() ; i++) {
            System.out.println("Espacio: "+ i + " tiene: " + semana.get(i));
        }
    }
}
