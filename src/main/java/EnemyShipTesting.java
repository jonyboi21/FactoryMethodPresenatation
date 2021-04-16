import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {

EnemyShip theEnemy = null;











        //create the facotry object
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        //enemy ship object

        Scanner userInput = new Scanner(System.in);
        System.out.println("What Type of Ship?");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if(theEnemy!= null){
                doStuffEnemy(theEnemy);
            }
        }

    }



        public static void doStuffEnemy (EnemyShip anEnemyShip){
            anEnemyShip.displayEnemyShip();
            anEnemyShip.followUserShip();
        }


}

