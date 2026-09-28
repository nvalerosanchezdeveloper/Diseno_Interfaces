import java.util.Scanner;

public class Main {
    public static <scanner> void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //1.    3 opciones: Mítico, épico o legendario.
        //2.    Crear dos brawlers con opciones a sorteo.
        //3.    Enfrentarlos.
        //4.    2 OPCIONES DE USUARIO: Guest-> Solo pone a luchar. Admin -> Puede poner a luchar, y puede
        //      crear brawlers.
        //5.    3 OPCIONES: - Ver brawlers - Combatir - Cerrar sesión.


//        ||||||||||||||| LEGENDARIO           | ÉPICO                   | MÍTICO             ||
//        ||----------------------------------------------------------------------------------||
//        || NOMBRE     | SÍ                   | SÍ                      | SÍ                 ||
//        || VIDA       | SÍ                   | SÍ                      | SÍ                 ||
//        || DAÑO       | SÍ                   | SÍ                      | SÍ                 ||
//        || PASIVA     |                      | SUMINISTROS             | ESCUDO             ||
//        || COPAS      | SÍ                   | SÍ                      | SÍ                 ||
//        || HABILIDAD  | HACE DAÑO            | SE CURA                 | ARMADURA           ||

//        FLUJO DE USUARIO:
//        1.  USUARIO: XXXXX
//            CONTRASEÑA: XXXXX
//                    2.  IF USUARIO == ADMIN -> CREA && JUEGA
//                        ELSE USUARIO == GUEEST -> JUEGA
//                        3.  USUARIO 1 VS 1.
//                            4.  ... Ya me he aburrido de seguir el flujo, ya seguiré ordenándolo.

        String userType1, userType2;
        userType1 = "";
        userType2 = "";

        System.out.println("User: ");
        Scanner Sc = sc.nextLine();
        System.out.println("Password: ");
    }

    abstract class Brawler {
        protected String name;
        protected int dmg;
        protected int hp;
        protected int trophies;

        public Brawler (String name, int hp, int dmg, int trophies) {
            this.name = name;
            this.hp = hp;
            this.dmg = dmg;
            this.trophies = trophies;
        }
    }
}
