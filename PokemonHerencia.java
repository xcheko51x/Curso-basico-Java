public class PokemonHerencia {

    String nombre;
    String tipo;
    int salud;

    PokemonHerencia(String nombre, String tipo, int salud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
    }

    public void informacionPokemon() {
        System.out.println(
            "El Pokemon: "+this.nombre+"\n"+
            "Es de tipo: "+this.tipo+"\n"+
            "Puntos de salud: "+this.salud+"\n"
        );
    }
    
}
