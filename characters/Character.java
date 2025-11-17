package characters;
import java.util.*;
import domain.Attack;

public class Character {

    protected String name;
    protected double health;
    protected double defense;
    protected double speed;
    protected  List<Attack> attacks;

    public Character(String name, double health, double defense, double speed, List<Attack> attacks) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.speed = speed;
        this.attacks = attacks;
    }


    public String getIcon(){
        return "";
    }

    public void damageTaken(double value){
        this.health = (this.health+this.defense) - value;
    }

    public double attacks(String name){
        for(Attack attack: attacks){
            if (attack.getName().equals(name)){
                return attack.getAttack();
            }
        }
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setHealth(double health) {
        this.health = health;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }



    public double getHealth() {
        return health;
    }

    public double getDefense() {
        return defense;
    }

    public double getSpeed() {
        return speed;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }
}
