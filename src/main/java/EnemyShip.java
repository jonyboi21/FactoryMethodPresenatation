public class EnemyShip {


    private String name;
    private double amountOfDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfDamage() {
        return amountOfDamage;
    }

    public void setAmountOfDamage(double amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }


    public void followUserShip(){
        System.out.println(getName() + " is following the User");
    }
    public void displayEnemyShip(){
        System.out.println(getName() + " is displaying of the screen");
    }
}
