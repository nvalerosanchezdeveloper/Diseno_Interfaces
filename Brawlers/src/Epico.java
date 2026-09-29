//Hereda de Brawler.java,

public class Epico extends Brawler {
    public Epico(String name){
        super(name, numeroAleatorioEntre(2000, 4000), numeroAleatorioEntre(800, 1500)); // 1 vida 2 daño
    }
    @Override
    public String getType(){
        return "Épico";
    }
}
