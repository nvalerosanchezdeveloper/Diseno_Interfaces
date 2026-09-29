//Hereda de Brawler.java

public class Mitico extends Brawler{
    public Mitico(String name){
        super( name, numeroAleatorioEntre(3000,6000), numeroAleatorioEntre(1200, 2000));
    }
    @Override
    public String getType(){
        return "Míticoo";
    }
}
