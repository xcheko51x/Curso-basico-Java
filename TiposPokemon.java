class Fuego extends PokemonHerencia {
    
    String fuerteContra;
    String debilContra;

    Fuego(String nombre, String tipo, int salud, String fc, String dc) {
        super(nombre, tipo, salud);

        this.fuerteContra = fc;
        this.debilContra = dc;
    }

    public void informacionTipo() {
        super.informacionPokemon();

        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}

class Agua extends PokemonHerencia {
    
    String fuerteContra;
    String debilContra;

    Agua(String nombre, String tipo, int salud, String fc, String dc) {
        super(nombre, tipo, salud);

        this.fuerteContra = fc;
        this.debilContra = dc;
    }

    public void informacionTipo() {
        super.informacionPokemon();

        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}

class Hierva extends PokemonHerencia {
    
    String fuerteContra;
    String debilContra;

    Hierva(String nombre, String tipo, int salud, String fc, String dc) {
        super(nombre, tipo, salud);

        this.fuerteContra = fc;
        this.debilContra = dc;
    }

    public void informacionTipo() {
        super.informacionPokemon();

        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}