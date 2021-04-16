import java.util.Scanner;

public class EnemyShipFactory {



   /* This is a facotry thats only job is creating ships
    By encapulting ship creatino, we only have one place to make modifications



*/

        public EnemyShip makeEnemyShip(String newShipType) {

            EnemyShip newShip = null;

            Scanner userInput = new Scanner(System.in);

            if (newShipType.equalsIgnoreCase("U")) {
                return new UFOEnemyShip();
            } else if (newShipType.equalsIgnoreCase("R")) {
                return new RocketEnemyShip();
            }return null;
        }


    }


