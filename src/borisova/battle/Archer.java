package borisova.battle;

public class Archer extends Hero{
    int health;
    public void takeDamage(int damage){
        int health2= health-damage;
    }
}
