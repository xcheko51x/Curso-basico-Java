/*
Los métodos caracterizan todo el comportamiento de un objeto o una clase. 
Por tanto, también pueden entenderse como funciones. 
Por el contrario, los atributos solo representan valores que caracterizan la naturaleza estática del objeto. 
Cada uno de los atributos puede tomar la forma de constantes o variables.
*/

public class EjemploAtributosMetodos {
    public static void main(String[] args) {
        
        Pokemon charmander = new Pokemon("Charmander", "Fuego", "Hierva","Agua", 100);
        //Pokemon squartle = new Pokemon("Squartle", "Agua", "Fuego", "Hierva", 100);


        charmander.ataca();
        int nuevaSalud = charmander.defiende(45);
        System.out.println("Ahora tiende de salud: "+nuevaSalud+"\n");

        charmander.informacionPokemon();
        //squartle.informacionPokemon();

    }
}
