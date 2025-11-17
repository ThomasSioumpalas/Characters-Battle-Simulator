package characters;

import domain.Attack;

import java.util.List;

public class Mage extends Character{


    private  String icon = "🧙";

    @Override
    public String getIcon() {
        return icon;
    }

    public Mage(String name, double health, double defense, double speed, List<Attack> attacks) {
        super(name, health, defense, speed, attacks);
    }
}
