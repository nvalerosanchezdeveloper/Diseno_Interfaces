//Esta es la Clase base de la que heredan las demás.
import java.util.Random;

public class Brawler {
    protected String name;
    protected int dmg;
    protected int hp;
    protected int trophies;

    //Generador aleatorio para las subclases.
    protected static Random random = new Random();

    //Constructor
    public Brawler (String name, int hp, int dmg){
        this.name = name; //    < --- this.name es el atributo y name es el parámetro.
        this.hp = hp;
        this.dmg = dmg;
        this.trophies = 300; // < --- 300 es el valor por defecto cuando un brawler nuevo se crea
    }

    protected static int numeroAleatorioEntre(int min, int max){
        return random.nextInt(max - min +1) + min; //   + min porque asi desplazo el rango a donde quiero.
    }

    //Getters
    public String getName() {return name;}
    public int getHp() {return hp;}
    public int getDmg() {return dmg;}
    public int getTrophies() {return trophies;}

    //Setters < --- Esto mantiene un control si modificamos atributos.
    public void setVida (int hp) {
        this.hp = Math.max (0, hp);
    }

    public void addTrophies (int amount){
        this.trophies = Math.max(0, this.trophies + amount);
    }

    @Override
    public String toString(){
        return "[" +name+ "] hp= " + hp + "dmg= " + dmg + "trophies= " + trophies;
    }






}






