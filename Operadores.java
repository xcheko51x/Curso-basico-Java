public class Operadores {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;

        // Operadores Aritmeticos
        // + , - , * , / , %

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Suma: "+ num1+" + "+num2+" = "+ suma);
        System.out.println("Resta: "+ num1+" - "+num2+" = "+ resta);
        System.out.println("Multiplicación: "+ num1+" * "+num2+" = "+ multiplicacion);
        System.out.println("División: "+ num1+" / "+num2+" = "+ division);
        System.out.println("Modulo: "+ num1+" % "+num2+" = "+ modulo);

        // Opera y asigna
        int num3 = 5;
        System.out.println("Antes: " + num3 + " opera y asigna: ++ " + num3++ + " Despues: " + num3 );
        System.out.println("Antes: " + num3 + " opera y asigna: -- " + num3-- + " Despues: " + num3 );

        // Operadores Relaciones
        /*
            == Igual a
            != Diferente de
            > Mayor que
            < Menor que
            > Mayor o igual que
            < Menor o igual que
         */

         System.out.println(num1 + " es igual a " +  num2 + " = " + (num1 == num2));
         System.out.println(num1 + " es diferente de " +  num2 + " = " + (num1 != num2));
         System.out.println(num1 + " es mayor que " +  num2 + " = " + (num1 > num2));
         System.out.println(num1 + " es menor que " +  num2 + " = " + (num1 < num2));
         System.out.println(num1 + " es mayor o igual que " +  num2 + " = " + (num1 >= num2));
         System.out.println(num1 + " es menor o igual que " +  num2 + " = " + (num1 <= num2));

         // Operadores Logicos
         /*
            && Y
            || O
         */

         int edad = 5;

         if(edad >= 18 && edad < 60) {
             System.out.println(edad + " es mayor o igual a 18 Y es menor a 60 : "+ (edad >= 18 && edad < 60));
         }

         if(edad >= 18 || edad < 60) {
            System.out.println(edad + " es mayor o igual a 18 O es menor a 60 : "+ (edad >= 18 || edad < 60));
        }
    }
}
