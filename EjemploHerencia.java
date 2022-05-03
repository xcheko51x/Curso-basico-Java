/*
Podemos definir la herencia como la capacidad de crear clases que adquieren de manera automática 
los miembros (atributos y métodos) de otras clases que ya existen, 
pudiendo al mismo tiempo añadir atributos y métodos propios.

Java soporta la herencia permitiendo una clase a incorporar otra clase en su declaración. 
Esto se hace mediante el uso de la palabra clave extends. 
Por lo tanto, la subclase se añade (se extiende) a la superclase.
*/

public class EjemploHerencia {
    public static void main(String[] args) {
        
        Fuego charmander = new Fuego("Charmander", "Fuego", 100, "Hierva", "Agua");
        charmander.informacionPokemon();

        Agua squartle = new Agua("Squartle", "Agua", 80, "Fuego", "Hierva");
        squartle.informacionPokemon();

        Hierva bulbasaur = new Hierva("Bulbasaur", "Hierva", 50, "Agua", "Fuego"); 
        bulbasaur.informacionTipo();

    }
}