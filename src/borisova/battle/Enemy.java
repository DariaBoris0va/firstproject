package borisova.battle;

public class Enemy implements Mortal {
    int health;
    public void takeDamage(int damage){
        int health2= health-damage;
    }
}
