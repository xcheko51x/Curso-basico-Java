public class Pokemon {

    String nombre;
    String tipo;
    String fuerteContra;
    String debilContra;
    int salud;

    Pokemon(String nombre, String tipo, String fuerte, String debil, int salud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerteContra = fuerte;
        this.debilContra = debil;
        this.salud = salud;
    }

    public void ataca() {
        System.out.println(
            "El Pokemon: "+this.nombre+" \n" +
            "Es de tipo: "+this.tipo+" \n" +
            "Esta atacando \n"
        );
    }

    public int defiende(int danio) {

        this.salud -= danio;

        System.out.println(
            "El Pokemon: "+this.nombre+" \n" +
            "Recibio un ataque de: "+danio+" daño \n"
        );

        return this.salud;
    }

    public void informacionPokemon() {
        System.out.println(
            "El Pokemon: "+this.nombre+"\n"+
            "Es de tipo: "+this.tipo+"\n"+
            "Es fuerte contra: "+this.fuerteContra+"\n"+
            "Es debil contra: "+this.debilContra+"\n"+
            "Tiene salud de: "+this.salud+"\n"
        );
    }
}