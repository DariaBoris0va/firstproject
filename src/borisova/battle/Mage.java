package borisova.battle;

public class Mage extends Hero{
    int health;
    public void takeDamage(int damage){
        int health2= health-damage;
    }
}
