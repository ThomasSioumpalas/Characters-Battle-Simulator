package domain;

public class Attack {

    private double attack;
    private String name;

    public Attack( String name,double attack) {
        this.attack = attack;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }
}
