package BrawlStars;

public class Raro implements Brawler {
    private final String nombre;
    private int vida;
    private final int ataque = 800;

    public Raro(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void disparar() {
        System.out.printf("%s (%d vida, %d, raro) disparando...%n", this.nombre, this.vida, this.ataque);
    }

    @Override
    public void mover() {
        System.out.printf("%s (%d vida, %d, raro) moviendo...%n", this.nombre, this.vida, this.ataque);
    }
}
