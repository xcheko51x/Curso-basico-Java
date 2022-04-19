class Fuego extends Pokemon {

    String fuerteContra;
    String debilContra;

    Fuego(String nombre, String tipo, String fc, String db) {
        super(nombre, tipo);

        this.fuerteContra = fc;
        this.debilContra = db;
    };

    public void informacionTipo() {
        super.informacionPokemon();
        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}

class Agua extends Pokemon{

    String fuerteContra;
    String debilContra;

    Agua(String nombre, String tipo, String fc, String db) {
        super(nombre, tipo);

        this.fuerteContra = fc;
        this.debilContra = db;
    };

    public void informacionTipo() {
        super.informacionPokemon();
        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}

class Hierva extends Pokemon {

    String fuerteContra;
    String debilContra;

    Hierva(String nombre, String tipo, String fc, String db) {
        super(nombre, tipo);

        this.fuerteContra = fc;
        this.debilContra = db;
    };

    public void informacionTipo() {
        super.informacionPokemon();
        System.out.println(
            "Es fuerte contra: " + this.fuerteContra + "\n" +
            "Es debil contra: " + this.debilContra + "\n"
        );
    }
}