class Pokemon {

    String nombre;
    String tipo;

    Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void informacionPokemon() {
        System.out.println(
            "El Pokemon: " + this.nombre + "\n" +
            "es de tipo: " + this.tipo
        );
    }
}