//Hereda de Brawler.java

public class Legendario extends Brawler {
    public Legendario (String name){
        super (name, numeroAleatorioEntre(4000, 8000), numeroAleatorioEntre(1500, 3000));    //  El super servía para apuntar al padre.
    }

    @Override
    public String getType(){
        return "Legendario";
    }

}
