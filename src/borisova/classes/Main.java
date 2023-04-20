package borisova.classes;

import borisova.classes.earth.aboveground.Ferret;
import borisova.classes.earth.aboveground.Hamster;
import borisova.classes.earth.aboveground.Mouse;
import borisova.classes.earth.belowground.Ferretnbelow;
import borisova.classes.earth.belowground.Hamsterbelow;
import borisova.classes.earth.belowground.Mousebelow;
import borisova.classes.water.fresh.Fishfresh;
import borisova.classes.water.fresh.Turtlefresh;
import borisova.classes.water.salty.Fish;
import borisova.classes.water.salty.Turtle;


public class Main {
    public static void main(String[] args) {
        Turtle turtle1= new Turtle();
        Turtlefresh turtle2= new Turtlefresh();
        Mouse mouse1= new Mouse();
        Mousebelow mouse2= new Mousebelow();
        Hamster hamster1= new Hamster();
        Hamsterbelow hamster2= new Hamsterbelow();
        Ferret ferret1= new Ferret();
        Ferretnbelow ferret2= new Ferretnbelow();
        Fish fish1= new Fish();
        Fishfresh fish2= new Fishfresh();
    }
}
